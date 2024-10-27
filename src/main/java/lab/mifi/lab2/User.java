package lab.mifi.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;
}
