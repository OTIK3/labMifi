package lab.mifi.lab2;

public class Main {
    public static void main(String[] args) {
        var uManipulator = new UserManipulation(FabricUser.getRandomUsers(5));
        System.out.println("Пользователи до преобразований: ");
        uManipulator.getUsers().forEach(System.out::println);

        System.out.println("\nПользователи отсортированные по lastName: ");
        uManipulator.getSortedByLastName().forEach(System.out::println);

        System.out.println("\nПользователи отсортированные по age: ");
        uManipulator.getSortedByAge().forEach(System.out::println);

        System.out.println("\nПользователи возрастом больше 7? -> " +
                (uManipulator.isSevenAge() ? "Yes" : "No"));

        System.out.println("Средний возраст всей пользователей: " + uManipulator.middleAge());
        System.out.println("Количество разных стран пользователей -> " + uManipulator.getCountryCount());
    }
}
