package lab.mifi.lab2;

import lab.mifi.DirectoryRandom;

import java.util.ArrayList;
import java.util.Random;

public class FabricUser {
    private static final Random random = new Random();
    private static final ArrayList<String> firstNames = DirectoryRandom.getNames();
    private static final ArrayList<String> lastNames = DirectoryRandom.getSurnames();
    private static final ArrayList<String> countries = DirectoryRandom.getCountry();

    public static ArrayList<User> getRandomUsers(int size) {
        var users = new ArrayList<User>(size);
        for (int i = 0; i < size; i++) {
            var firstName = firstNames.get(random.nextInt(0, firstNames.size()));
            var lastName = lastNames.get(random.nextInt(0, lastNames.size()));
            var age = random.nextInt(0, 80);
            var country = countries.get(random.nextInt(0, countries.size()));

            var user = new User(firstName, lastName, age, country);
            users.add(user);
        }

        return users;
    }
}
