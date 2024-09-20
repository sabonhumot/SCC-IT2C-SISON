package javaapplication78;

import java.util.Scanner;

public class Grades {

    int id;
    String name;
    double pl, m, pf, f;

    public void addGrades(int sid, String sname, double spl, double sm, double spf, double sf) {

        this.id = sid;
        this.name = sname;
        this.pl = spl;
        this.m = sm;
        this.pf = spf;
        this.f = sf;

    }

    public void viewGrades() {
        double ave = (this.pl + this.m + this.pf + this.f) / 4;
        String remarks = (ave > 3.0) ? "Failed" : "Passed";

        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", this.id, this.name, this.pl, this.m, this.pf, this.f, ave, remarks);

    }

    public void editGrade(Grades[] gr, int nos, int id) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nos; i++) {
            if (gr[i].id == id) {

                System.out.print("\nEnter New Prelim Grade: ");
                double pl = input.nextDouble();
                gr[i].pl = pl;

                System.out.print("Enter New Midterm Grade: ");
                double m = input.nextDouble();
                gr[i].m = m;

                System.out.print("Enter New Prefinal Grade: ");
                double pf = input.nextDouble();
                gr[i].pf = pf;

                System.out.print("Enter New Final Grade: ");
                double f = input.nextDouble();
                gr[i].f = f;
            } else {
                System.out.println("ID not found.");
            }
        }

    }

    public void removeGrade(Grades[] gr, int nos, int id) {

        for (int x = 0; x < nos; x++) {
            if (gr[x].id == id) {
                System.out.printf("Removing grades with ID: %d", id);
                for (int i = x; x < nos; x++) {
                    gr[i] = gr[i + 1];
                }
                System.out.println("\nGrades Removed Successfully.");
                nos--;
            } else {
                System.out.println("Student ID not found.");
            }
        }

    }
}
