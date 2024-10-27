package lab.mifi.lab1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricStudents {
    private static final Random random = new Random();
    private static final ArrayList<String> names = new ArrayList<>(
            List.of("Иван", "Петр", "Сергей", "Александр", "Дмитрий", "Алексей", "Андрей", "Евгений", "Николай", "Владимир", "Максим", "Олег", "Антон", "Денис", "Михаил")
    );

    private static final ArrayList<String> surnames = new ArrayList<>(
            List.of("Иванов", "Петров", "Сидоров", "Кузнецов", "Смирнов", "Попов", "Соколов", "Васильев", "Зайцев", "Волков", "Михайлов", "Федоров", "Григорьев", "Алексеев", "Павлов")
    );

    private static final ArrayList<String> groups = new ArrayList<>(
            List.of("Группа 101", "Группа 205", "Группа 309", "Группа 412", "Группа 503", "Группа 614", "Группа 708", "Группа 802", "Группа 911", "Группа 1007", "Группа 1105", "Группа 1213", "Группа 1304", "Группа 1410", "Группа 1506")
    );

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
