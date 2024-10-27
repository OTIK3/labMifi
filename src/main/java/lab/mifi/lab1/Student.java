package lab.mifi.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Student {
    private String name;
    private String group;
    private int course;
    private double averageGrades;
}
