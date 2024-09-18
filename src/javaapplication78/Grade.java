package javaapplication78;

import java.util.Scanner;

/**
 * to get the user input
 *
 */
public class Grade {

    public void editGrade(Grades[] gr, int nos, int id) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nos; i++) {
            if (gr[i].id == id) {

                System.out.print("Enter New Prelim Grade: ");
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
            }
        }

    }

    public void genGrade() {

        Scanner input = new Scanner(System.in);
        Grades[] gr = new Grades[100];
        int noStuds = 0;
        String choice;

        do {

            System.out.println("Welcome to Grading App!");
            System.out.println("---------------------------------------------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("---------------------------------------------------------");

            System.out.print("Enter option: ");
            int option = input.nextInt();

            while (option > 5) {
                System.out.println("Invalid Action. Please Try Again.");
                option = input.nextInt();
            }

            switch (option) {

                case 1:
                    System.out.print("Enter no. of students: ");
                    noStuds = input.nextInt();

                    for (int x = 0; x < noStuds; x++) {
                        System.out.print("Enter details of student " + (x + 1) + ".\n");

                        System.out.print("Student ID: ");
                        int sid = input.nextInt();
                        input.nextLine();

                        System.out.print("Name: ");
                        String name = input.nextLine();

                        System.out.print("Prelim: ");
                        double pl = input.nextDouble();

                        System.out.print("Midterm: ");
                        double m = input.nextDouble();

                        System.out.print("Prefinal: ");
                        double pf = input.nextDouble();

                        System.out.print("Final: ");
                        double f = input.nextDouble();

                        gr[x] = new Grades();
                        gr[x].addGrades(sid, name, pl, m, pf, f);

                    }
                    break;

                case 2:
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("-%15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s", "Student ID", "Name", "Prelim", "Midterm", "Prefinal", "Final", "Average", "Remarks\n");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    for (int x = 0; x < noStuds; x++) {
                        gr[x].viewGrades();

                    }
                    break;

                case 3:
                     System.out.print("Enter ID to Update: ");
                     int sid = input.nextInt();
                 System.out.printf("%d", sid);
                     editGrade(gr, noStuds, sid);
                    break;
            }
            System.out.println("Do you want to continue? (Y/N): ");
            choice = input.next();
        } while (choice.equals("Y") || choice.equals("y"));
    }
}
