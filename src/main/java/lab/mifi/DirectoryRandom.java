package lab.mifi;

import java.util.ArrayList;
import java.util.List;

public class DirectoryRandom {
    private static final ArrayList<String> names = new ArrayList<>(
            List.of("Иван", "Петр", "Сергей", "Александр", "Дмитрий", "Алексей", "Андрей", "Евгений", "Николай", "Владимир", "Максим", "Олег", "Антон", "Денис", "Михаил")
    );

    private static final ArrayList<String> surnames = new ArrayList<>(
            List.of("Иванов", "Петров", "Сидоров", "Кузнецов", "Смирнов", "Попов", "Соколов", "Васильев", "Зайцев", "Волков", "Михайлов", "Федоров", "Григорьев", "Алексеев", "Павлов")
    );

    private static final ArrayList<String> groups = new ArrayList<>(
            List.of("Группа 101", "Группа 205", "Группа 309", "Группа 412", "Группа 503", "Группа 614", "Группа 708", "Группа 802", "Группа 911", "Группа 1007", "Группа 1105", "Группа 1213", "Группа 1304", "Группа 1410", "Группа 1506")
    );

    private static final ArrayList<String> country = new ArrayList<>(
            List.of("Россия", "США", "Китай", "Япония", "Германия", "Франция", "Великобритания", "Канада", "Австралия", "Индия", "Бразилия", "Италия", "Испания", "Мексика", "Южная Корея")
    );

    public static ArrayList<String> getNames(){
        return new ArrayList<>(List.copyOf(names));
    }

    public static ArrayList<String> getSurnames(){
        return new ArrayList<>(List.copyOf(surnames));
    }

    public static ArrayList<String> getGroups(){
        return new ArrayList<>(List.copyOf(groups));
    }

    public static ArrayList<String> getCountry(){
        return new ArrayList<>(List.copyOf(country));
    }
}
