package lab.mifi.lab2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter
public class UserManipulation {
    private final ArrayList<User> users;

    public ArrayList<User> getSortedByLastName(){
        return new ArrayList<>(
                users.stream()
                        .sorted(Comparator.comparing(User::getLastName))
                        .toList()
        );
    }

    public ArrayList<User> getSortedByAge(){
        return new ArrayList<>(
                users.stream()
                        .sorted(Comparator.comparing(User::getAge))
                        .toList()
        );
    }

    public boolean isSevenAge(){
        return users.stream()
                .allMatch(u -> u.getAge() > 7);
    }

    public double middleAge(){
        return (double) users.stream()
                .map(User::getAge)
                .reduce(0, Integer::sum) / users.size();
    }

    public int getCountryCount(){
        return users.stream()
                .map(User::getCountry)
                .collect(Collectors.toSet())
                .size();
    }
}
