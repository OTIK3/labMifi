package lab.mifi.lab1;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class University {
    private ArrayList<Student> students;

    public void printStudentsByCourse(int course){
        var filterStudents = students.stream().
                filter(s -> s.getCourse() == course).
                map(Student::getName).
                toList();
        System.out.print("Студенты, которые учатся на " + course + " курсе: " + filterStudents);
    }

    public void deleteStudentsBy3(){
        students = new ArrayList<>(
                students.stream().
                        filter(s -> s.getAverageGrades() > 3.0).
                        map(s -> new Student(
                                s.getName(),
                                s.getGroup(),
                                (s.getCourse() + 1),
                                s.getAverageGrades())).
                        toList()
        );
    }

    public List<Student> getStudents(){
        return new ArrayList<>(students);
    }
}
