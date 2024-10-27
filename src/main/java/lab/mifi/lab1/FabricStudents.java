package lab.mifi.lab1;

import lab.mifi.DirectoryRandom;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;

public class FabricStudents {
    private static final Random random = new Random();
    private static final ArrayList<String> names = DirectoryRandom.getNames();
    private static final ArrayList<String> surnames = DirectoryRandom.getSurnames();
    private static final ArrayList<String> groups = DirectoryRandom.getGroups();

    public static ArrayList<Student> getRandomStudents(int size){
        var students = new ArrayList<Student>(size);
        for (int i = 0; i < size; i++) {
            var name = names.get(random.nextInt(0, names.size())) + " " +
                    surnames.get(random.nextInt(0, surnames.size()));
            var group = groups.get(random.nextInt(0, groups.size()));
            var course = random.nextInt(1, 5);
            var averageGrades =
                    BigDecimal.valueOf(random.nextDouble(2.0, 5.0)).setScale(1, RoundingMode.HALF_UP).doubleValue();

            var student = new Student(name, group, course, averageGrades);
            students.add(student);
        }

        return students;
    }
}
