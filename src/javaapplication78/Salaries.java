package javaapplication78;

import java.util.Scanner;

public class Salaries {

    int id, rate, hours, td;
    String name;

    public void employeeData(int eid, String ename, int erate, int ehours, int etd) {

        this.id = eid;
        this.name = ename;
        this.rate = erate;
        this.hours = ehours;
        this.td = etd;
    }

    public void viewData() {

        double gross = this.rate * this.hours;
        double netPay = gross - this.td;

//            System.out.println("-------------------------------------------------------------------------------");
//            System.out.printf("%-15s %-10s %-15s %-20s %-10s %-15s %-10s", "Employee ID", "Name", "Rate (Hourly)", "Total Hours Worked", "Gross", "Total Deduction", "Net Pay\n");
//            System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%-15d %-10s %-15d %-20d %-10.2f %-15d %-10.2f\n", this.id, this.name, this.rate, this.hours, gross, this.td, netPay);
    }

    public void editData(Salaries[] slr, int noe, int id) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < noe; i++) {
            if (slr[i].id == id) {

                System.out.print("\nEnter New Rate (Hourly): ");
                int rate = input.nextInt();
                slr[i].rate = rate;

                System.out.print("Enter New Total Hours Worked: ");
                int thw = input.nextInt();
                slr[i].hours = thw;

                System.out.print("Enter New Total Deduction: ");
                int td = input.nextInt();
                slr[i].td = td;

            } else {
                System.out.println("Employee ID not found.");
            }
        }
    }

    public void removeData(Salaries[] slr, int noe, int id) {

        for (int i = 0; i < noe; i++) {
            if (slr[i].id == id) {
                System.out.printf("Removing Employee with ID: %d", id);
                for (int x = i; x < noe; x++) {
                    slr[x] = slr[x + 1];
                }
                System.out.println("\nEmployee Removed Successfully.");
                noe--;
            } else {
                System.out.println("Employee ID not found.");
            }
        }
    }
}
