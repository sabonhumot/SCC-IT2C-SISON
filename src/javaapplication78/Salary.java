package javaapplication78;

import java.util.Scanner;

public class Salary {

    //public static void main(String[] args) {
    public void addData() {

        Scanner input = new Scanner(System.in);
        Salaries[] sl = new Salaries[100];

        System.out.print("Enter number of Employees: ");
        int noOfEmp = input.nextInt();

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

        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%-15s %-10s %-15s %-20s %-10s %-15s %-10s", "Employee ID", "Name", "Rate (Hourly)", "Total Hours Worked", "Gross", "Total Deduction", "Net Pay\n");
        System.out.println("-------------------------------------------------------------------------------");

        for (int x = 0; x < noOfEmp; x++) {
            sl[x].viewData();
        }
    }
}
