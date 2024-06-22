package model;
import java.util.*;


public class Student extends User {
    private List<Course> courses;

    public Student(String username, String password) {
        super(username, password);
        courses = new ArrayList<>();
    }

    public Student addCourse(Course course) {
        courses.add(course);
        return this;
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled yet.");
        } else {
            System.out.println("List of Courses for Student:");
            for (Course course : courses) {
                System.out.println(course.getName());
            }
        }
    }
}

