package javaapplication78;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class slipDetails {

    public void getPay() {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat php = new DecimalFormat("P#,###.00");

        String name;
        int age, rph = 0, thw = 0, totalDed = 0;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter age: ");
        age = input.nextInt();

        System.out.print("Enter rate per hour: ");
        rph = input.nextInt();

        System.out.print("Enter total hours worked: ");
        thw = input.nextInt();

        System.out.print("Enter total deductions: ");
        totalDed = input.nextInt();

        System.out.println("----------------------------------------");
        System.out.println("SLIP DETAILS");
        System.out.println("----------------------------------------");

        LocalDate date = LocalDate.now();

        System.out.println("Date: " + date);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        double totalGross = rph * thw;

        System.out.println("Total Gross: " + php.format(totalGross));
        System.out.println("Total Deduction: " + php.format(totalDed));

        System.out.println("----------------------------------------");
        double netPay = totalGross - (double) totalDed;
        System.out.println("Net Pay: " + php.format(netPay));
        System.out.println("----------------------------------------");
        
    }
}
