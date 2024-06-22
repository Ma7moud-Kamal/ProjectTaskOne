package model;


import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
    private List<Student> students;

    public Instructor(String username, String password) {
        super(username, password);
        students = new ArrayList<>();
    }

    public Instructor addStudent(Student student) {
        students.add(student);
        return this ;
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students associated with this instructor yet.");
        } else {
            System.out.println("List of Students for Instructor:");
            for (Student student : students) {
                System.out.println(student.getUsername());
            }
        }
    }
}