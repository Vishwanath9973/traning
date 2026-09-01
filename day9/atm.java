package day9;
import java.util.ArrayList;
import java.util.Scanner;

public class atm {

    static class Employee {
        String name;
        int age;
        String designation;
        double salary;

        Employee(String name, int age, String designation, double salary) {
            this.name = name;
            this.age = age;
            this.designation = designation;
            this.salary = salary;
        }
    }

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean exitProgram = false;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. create");
            System.out.println("2. display");
            System.out.println("3. Increase Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your option: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid option. Please enter 1, 2, 3 or 4.");
                continue;
            }

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
                System.out.println("Invalid option. Please try again.");
            }

        } while (!exitProgram);
    }

    static void create() {

        String again;

        do {
            String name;

            while (true) {
                System.out.print("\nEnter employee name: ");
                name = sc.nextLine();

                if (countSpaces(name) <= 2) {
                    break;
                }

                System.out.println("Invalid name. Maximum 2 spaces are allowed.");
            }

            int age;

            while (true) {
                System.out.print("Enter employee age(above 18): ");

                try {
                    age = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age. Please enter a number.");
                    continue;
                }

                if (age >= 18 && age <= 60) {
                    break;
                }

                System.out.println("Invalid age. Enter age between 18 and 60.");
            }

            String letter;

            while (true) {
                System.out.print(
                    "Enter designation (p-Programmer, t-Tester, m-Manager): "
                );

                letter = sc.nextLine().trim().toLowerCase();

                if (letter.equals("p") ||
                    letter.equals("t") ||
                    letter.equals("m")) {
                    break;
                }

                System.out.println("Invalid designation. Enter p, t or m.");
            }

            String designation;
            double salary;

            if (letter.equals("p")) {
                designation = "Programmer";
                salary = 35000;
            } else if (letter.equals("t")) {
                designation = "Tester";
                salary = 25000;
            } else {
                designation = "Manager";
                salary = 50000;
            }

            employees.add(
                new Employee(name, age, designation, salary)
            );

            System.out.println("\nEmployee added successfully.");
            System.out.println("Name        : " + name);
            System.out.println("Age         : " + age);
            System.out.println("Designation : " + designation);
            System.out.println("Salary      : " + salary);

            System.out.print("\nAdd another employee? (yes/no): ");
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("yes"));
    }

    static int countSpaces(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    static void display() {

        if (employees.isEmpty()) {
            System.out.println("\nNo employees have been added.");
            return;
        }

        System.out.println("\nEmployee Details");

        for (int i = 0; i < employees.size(); i++) {

            Employee e = employees.get(i);

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Name        : " + e.name);
            System.out.println("Age         : " + e.age);
            System.out.println("Designation : " + e.designation);
            System.out.println("Salary      : " + e.salary);
        }
    }

    static void raiseSalary() {

        if (employees.isEmpty()) {
            System.out.println("\nNo employees have been added.");
            return;
        }

        System.out.print("\nEnter employee name: ");
        String name = sc.nextLine();

        Employee found = null;

        for (Employee e : employees) {

            if (e.name.equalsIgnoreCase(name)) {
                found = e;
                break;
            }
        }

        if (found == null) {
            System.out.println("Employee not found.");
            return;
        }

        double percent;

        while (true) {

            System.out.print("Enter salary increase percentage (1-10): ");

            try {
                percent = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (percent >= 1 && percent <= 10) {
                break;
            }

            System.out.println("Enter a percentage between 1 and 10.");
        }

        double oldSalary = found.salary;

        found.salary = found.salary + (found.salary * percent / 100);

        System.out.println("\nSalary updated successfully.");
        System.out.println("Employee   : " + found.name);
        System.out.println("Old Salary : " + oldSalary);
        System.out.println("New Salary : " + found.salary);
    }

    static void exit() {

        System.out.print("\nDo you want to exit? (yes/no): ");
        String confirm = sc.nextLine().trim();

        if (confirm.equalsIgnoreCase("yes")) {

            System.out.println("Program ended.");
            exitProgram = true;

        } else {

            System.out.println("Returning to menu.");
        }
    }
}