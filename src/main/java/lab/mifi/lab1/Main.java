package lab.mifi.lab1;

public class Main {
    public static void main(String[] args) {
        var university = new University(FabricStudents.getRandomStudents(10));

        System.out.println("Студенты до удаления: ");
        university.getStudents().forEach(System.out::println);

        university.deleteStudentsBy3();
        System.out.println("\nСтуденты после удаления: ");
        university.getStudents().forEach(System.out::println);

        university.printStudentsByCourse(2);
    }
}
