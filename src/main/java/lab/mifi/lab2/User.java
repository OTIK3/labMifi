package lab.mifi.lab2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class User {
    private static int count = 0;
    private int id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String country;

    {
        id = count++;
    }
}
