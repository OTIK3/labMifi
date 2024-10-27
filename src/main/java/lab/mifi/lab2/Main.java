package lab.mifi.lab2;

public class Main {
    public static void main(String[] args) {
        var uManipulator = new UserManipulation(FabricUser.getRandomUsers(10));
        System.out.println("Пользователи до преобразований: ");
        uManipulator.getUsers().forEach(System.out::println);

        System.out.println("Пользователи отсортированные по lastName = Петров: ");
        uManipulator.getFilterLastNameUsers("Петров").forEach(System.out::println);

        System.out.println("Пользователи отсортированные по age = 10");
        uManipulator.getFilterAgeUsers(10).forEach(System.out::println);

        System.out.println("Пользователи возрастом больше 7? -> " +
                (uManipulator.isSevenAgeUsers() ? "Yes" : "No"));

        System.out.println("Средний возраст всей пользователей: " + uManipulator.middleAgeUsers());
        System.out.println("Количество разных стран пользователей -> " + uManipulator.getCountryCount());
    }
}
