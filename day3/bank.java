import java.util.Scanner;

public class EmployeeManagementSimple {

    static String name;
    static int age;
    static String designation;
    static double salary;
    static boolean employeeExists = false;

    static Scanner sc = new Scanner(System.in);

    static boolean exitProgram = false;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    raiseSalary();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (!exitProgram);
    }

    // Case 4: Exit
    static void exit() {
        System.out.print("Are you sure you want to exit? (yes/no): ");
        String confirm = sc.nextLine().trim();

        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Exiting program. Goodbye!");
            exitProgram = true;
        } else {
            System.out.println("Okay, returning to menu.");
        }
    }

    // Case 1: Create employee
    static void create() {
        String again;
        do {
            // Name: only up to 2 spaces allowed (e.g. "First Middle Last")
            while (true) {
                System.out.print("Enter name: ");
                name = sc.nextLine();
                if (countSpaces(name) <= 2) {
                    break;
                }
                System.out.println("Invalid name. Only up to 2 spaces are allowed.");
            }

            // Age: must be between 18 and 60
            while (true) {
                System.out.print("Enter age (18-60): ");
                age = Integer.parseInt(sc.nextLine().trim());
                if (age >= 18 && age <= 60) {
                    break;
                }
                System.out.println("Invalid age. Age must be between 18 and 60.");
            }

            // Designation: single letter p, t, or m
            String letter;
            while (true) {
                System.out.print("Enter designation (p - Programmer, t - Tester, m - Manager): ");
                letter = sc.nextLine().trim().toLowerCase();
                if (letter.equals("p") || letter.equals("t") || letter.equals("m")) {
                    break;
                }
                System.out.println("Invalid input. Please enter p, t, or m.");
            }

            if (letter.equals("m")) {
                designation = "Manager";
                salary = 50000;
            } else if (letter.equals("p")) {
                designation = "Programmer";
                salary = 35000;
            } else {
                designation = "Tester";
                salary = 25000;
            }

            employeeExists = true;
            System.out.println(name + " added with base salary " + salary);

            System.out.print("Add another person? (yes/no): ");
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("yes"));
    }

    // Counts the number of spaces in a string
    static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Case 2: Display employee
    static void display() {
        if (!employeeExists) {
            System.out.println("No employee created yet.");
            return;
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    // Case 3: Raise salary
    static void raiseSalary() {
        if (!employeeExists) {
            System.out.println("No employee created yet.");
            return;
        }
        System.out.print("Enter raise percentage (e.g. 10 for 10%): ");
        double percent = Double.parseDouble(sc.nextLine().trim());
        salary = salary + (salary * percent / 100);
        System.out.println("New salary of " + name + " is " + salary);
    }
}
