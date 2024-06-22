package model;
import java.util.*;

public class Authenticator {
    private Map<String, User> users;
    private  boolean listPrinted   ;

    public Authenticator() {
        users = new HashMap<>();
        listPrinted = false ;


        users.put("st1", new Student("st1", "passSt1"));
        users.put("st2", new Student("st2", "passSt2"));
        users.put("st3", new Student("st3", "passSt3"));
        users.put("st4", new Student("st4", "passSt4"));
        users.put("st5", new Student("st5", "passSt5"));
        users.put("st6", new Student("st6", "passSt6"));
        users.put("st7", new Student("st7", "passSt7"));
        users.put("st8", new Student("st8", "passSt8"));
        users.put("st9", new Student("st9", "passSt9"));

        users.put("inst1", new Instructor("inst1", "passInst1"));
        users.put("inst2", new Instructor("inst2", "passInst2"));
        users.put("inst3", new Instructor("inst3", "passInst3"));


        Instructor inst1 = (Instructor) users.get("inst1");
        Instructor inst2 = (Instructor) users.get("inst2");
        Instructor inst3 = (Instructor) users.get("inst2");

        Student st1 = (Student) users.get("st1");
        Student st2 = (Student) users.get("st2");
        Student st3 = (Student) users.get("st3");
        Student st4 = (Student) users.get("st4");
        Student st5 = (Student) users.get("st5");
        Student st6 = (Student) users.get("st6");
        Student st7 = (Student) users.get("st7");
        Student st8 = (Student) users.get("st8");
        Student st9 = (Student) users.get("st9");

        st1.addCourse(new Course("Physics")).addCourse(new Course("Chemistry")).addCourse(new Course("Math"));
        st2.addCourse(new Course("English")).addCourse(new Course("OOP")).addCourse(new Course("Math"));
        st3.addCourse(new Course("Ml")).addCourse(new Course("Chemistry")).addCourse(new Course("AI"));
        st4.addCourse(new Course("Algorithms")).addCourse(new Course("Java")).addCourse(new Course("Math"));
        st5.addCourse(new Course("Physics")).addCourse(new Course("Data Structure")).addCourse(new Course("Math"));
        st6.addCourse(new Course("Algorithms")).addCourse(new Course("OOP")).addCourse(new Course("Data Structure"));
        st7.addCourse(new Course("ML")).addCourse(new Course("AI")).addCourse(new Course("Data Structure"));
        st8.addCourse(new Course("Java")).addCourse(new Course("OOP")).addCourse(new Course("Database"));


        inst1.addStudent(st2).addStudent(st4).addStudent(st6).addStudent(st8);
        inst2.addStudent(st1).addStudent(st3).addStudent(st5).addStudent(st7);

//        System.out.println("Stored credentials:");
//        for (Map.Entry<String, User> entry : users.entrySet()) {
//            String username = entry.getKey();
//            User user = entry.getValue();
//            String password = user.getPassword(); // Assuming there is a getPassword() method in the User class
//            System.out.println("Username: " + username + ", Password: " + password);
//        }
    }



    public User authenticateUser(String username, String password) {
//        String Username = username;
//        String EnteredPassword = password;
//        System.out.println("Lowercase username: " + lowercaseUsername);
//        System.out.println("Lowercase username: " + lowercasePassword);
//        System.out.println("Stored usernames: " + users.keySet());
//        System.out.println("Stored passwords: " + users.keySet());
//        System.out.println("Login Successful:");

        User user = users.get(username);


        if (user != null && user.authenticate(password)) {

//            if (user instanceof Student) {
//                ((Student) user).viewCourses();
//            } else if (user instanceof Instructor) {
//                ((Instructor) user).viewStudents();
//            }

            return user;
        }

        return null;

}
    public void printList(User user) {
        if (user instanceof Student) {
            ((Student) user).viewCourses();
        } else if (user instanceof Instructor) {
            ((Instructor) user).viewStudents();
        }
    }
}
