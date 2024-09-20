package javaapplication78;

import java.util.Scanner;

public class Account {

    public void addAcc() {

        Scanner input = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];
        int noOfAcc = 0;
        String choice;

        do {

            System.out.println("Welcome to Accounts App!");
            System.out.println("---------------------------------------------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("---------------------------------------------------------");

            System.out.print("Enter Action: ");
            int action = input.nextInt();

            while (action > 5) {
                System.out.println("Invalid Action. Please Try Again.");
                action = input.nextInt();
            }

            Accounts accts = new Accounts();

            switch (action) {
                case 1:
                    System.out.print("Enter no of accounts: ");
                    noOfAcc = input.nextInt();

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
                    break;

                case 2:
                    System.out.println("------------------------------------------------------------------------------------------------");
                    System.out.printf("%-15s %-15s %-20s %-15s %-20s", "User ID", "Name", "eMail", "Username", "Password");
                    System.out.println("\n----------------------------------------------------------------------------------------------");
                    for (int x = 0; x < noOfAcc; x++) {
                        acc[x].viewDetails();
                    }
                    break;

                case 3:
                    System.out.print("Enter User ID to Update: ");
                    int id = input.nextInt();
                    System.out.printf("\nUser ID: %d", id);
                    accts.editDetails(acc, noOfAcc, id);
                    System.out.println("Account Updated Successfully.");
                    break;

                case 4:
                    System.out.print("Enter User ID to Remove: ");
                    id = input.nextInt();
                    accts.removeAccount(acc, noOfAcc, id);
                    noOfAcc--;
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
