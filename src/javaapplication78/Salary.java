package javaapplication78;

import java.util.Scanner;

public class Salary {

    public void addData() {

        Scanner input = new Scanner(System.in);
        Salaries[] sl = new Salaries[100];
        int noOfEmp = 0;
        String choice;

        do {

            System.out.println("Welcome to Salary App!");
            System.out.println("---------------------------------------------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("---------------------------------------------------------");

            System.out.print("Enter action: ");
            int action = input.nextInt();

            while (action > 5) {
                System.out.println("Invalid Action. Please Try Again.");
                action = input.nextInt();
            }

            Salaries slr = new Salaries();
            switch (action) {
                case 1:
                    System.out.print("Enter number of Employees: ");
                    noOfEmp = input.nextInt();

                    for (int x = 0; x < noOfEmp; x++) {
                        System.out.printf("Details of Employee %d\n", x + 1);

                        System.out.print("Employee ID: ");
                        int id = input.nextInt();
                        input.nextLine();

                        System.out.print("Name: ");
                        String name = input.nextLine();

                        System.out.print("Rate (hourly): ");
                        int rate = input.nextInt();

                        System.out.print("Hours Worked: ");
                        int hours = input.nextInt();

                        System.out.print("Total Deduction: ");
                        int td = input.nextInt();

                        sl[x] = new Salaries();
                        sl[x].employeeData(id, name, rate, hours, td);
                    }
                    break;

                case 2:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("%-15s %-10s %-15s %-20s %-10s %-15s %-10s", "Employee ID", "Name", "Rate (Hourly)", "Total Hours Worked", "Gross", "Total Deduction", "Net Pay");
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------");

                    for (int x = 0; x < noOfEmp; x++) {
                        sl[x].viewData();
                    }
                    break;

                case 3:
                    System.out.println("Enter Employee ID to Update: ");
                    int id = input.nextInt();
                    System.out.printf("\nEmployee ID: %d", id);
                    slr.editData(sl, noOfEmp, id);
                    System.out.println("Employee Data Updated Successfully.");
                    break;

                case 4:
                    System.out.println("Enter Employee ID to Remove: ");
                    id = input.nextInt();
                    System.out.printf("\nEmployee ID: %d", id);
                    slr.removeData(sl, noOfEmp, id);
                    noOfEmp--;
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
            }
            System.out.println("Do you want to continue? (Y/N): ");
            choice = input.next();

        } while (choice.equals("Y") || choice.equals("y"));
    }
}
