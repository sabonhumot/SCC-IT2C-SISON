package javaapplication78;

import java.util.Scanner;

public class Account {

    public void addAcc() {

        Scanner input = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];

        System.out.print("Enter no of accounts: ");
        int noOfAcc = input.nextInt();

        for (int x = 0; x < noOfAcc; x++) {
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

            acc[x] = new Accounts();
            acc[x].addDetails(id, name, name, userName, name);

            while (true) {
                System.out.print("Enter password: ");
                String password = input.nextLine();

                String specialChars = ".*[?!@#$%^&*()_+-=]*.";

//                acc[x].passwordVerifier(password);

                if (password.length() < 8
                        && password.matches(".*[A-Z]*.")
                        && password.matches(specialChars)
                        && password.matches(".*\\d*.")) {
//                  if (acc[x].passwordVerifier(password)) {
//                      break;
                    
                }
            }

        }

    }
}
