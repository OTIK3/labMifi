package lab.mifi.lab2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter
public class UserManipulation {
    private final ArrayList<User> users;

    public ArrayList<User> getFilterLastNameUsers(String lastName){
        return new ArrayList<>(
                users.stream()
                        .filter(u -> u.getLastName().equals(lastName))
                        .toList()
        );
    }

    public ArrayList<User> getFilterAgeUsers(int age){
        return new ArrayList<>(
                users.stream()
                        .filter(u -> u.getAge() == age)
                        .toList()
        );
    }

    public boolean isSevenAgeUsers(){
        return users.stream()
                .allMatch(u -> u.getAge() > 7);
    }

    public double middleAgeUsers(){
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
