import model.* ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Authenticator authenticator = new Authenticator();
        Scanner scanner = new Scanner(System.in);

//        Course[] courses = {
//                new Course("Math"),
//                new Course("Physics"),
//                new Course("Chemistry"),
//                new Course("Programming"),
//                new Course("OOP"),
//                new Course("English"),
//                new Course("AI"),
//                new Course("Data Structure"),
//                new Course("DataBase"),
//                new Course("Java")
//        };

        while (true) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            User authenticatedUser = authenticator.authenticateUser(username, password);

            if (authenticatedUser != null) {
                System.out.println("Login Successful:");
                authenticator.printList(authenticatedUser);
                break;
            } else {
                System.out.println("Login failed. Please try again.");
            }
        }

        scanner.close();
    }
}

