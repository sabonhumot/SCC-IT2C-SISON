package javaapplication78;

import java.util.Scanner;

public class Account {

    public void addAcc() {

        Scanner input = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];

        System.out.print("Enter no of accounts: ");
        int noOfAcc = input.nextInt();

        for (int x = 0; x < noOfAcc; x++) {
            acc[x] = new Accounts();
            System.out.printf("Enter details of account %d\n", x + 1);

            System.out.print("Enter ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter email: ");
            String eMail = input.nextLine();

            System.out.print("Enter username: ");
            String userName = input.nextLine();

            String password;
            while (true) {
                System.out.print("Enter password: ");
                password = input.nextLine();

                if (acc[x].passwordVerifier(password)) {
                    System.out.println("Password is Valid.");
                    break;
                } else {
                    System.out.println("Invalid password! The password must contain at least:");
                    System.out.println("- Minimum length of 8 characters.");
                    System.out.println("- 1 digit.");
                    System.out.println("- 1 special character.");
                    System.out.println("- 1 uppercase letter");
                }
            }
            acc[x].addDetails(id, name, eMail, userName, password);
        }

        for (int x = 0; x < noOfAcc; x++) {
            acc[x].viewDetails();
        }

    }

}
