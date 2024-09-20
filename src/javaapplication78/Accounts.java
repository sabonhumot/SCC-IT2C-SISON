package javaapplication78;

import java.util.Scanner;

public class Accounts {

    int id;
    String name, eMail, userName, password;

    public void addDetails(int uid, String uName, String uem, String user, String pass) {

        this.id = uid;
        this.name = uName;
        this.eMail = uem;
        this.userName = user;
        this.password = pass;
    }

    public void viewDetails() {

//        System.out.println("------------------------------------------------------------------------------------------------");
//        System.out.printf("%-15s %-15s %-20s %-15s %-20s", "User ID", "Name", "eMail", "Username", "Password");
//        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.printf("%-15d %-15s %-20s %-15s %-20s\n", this.id, this.name, this.eMail, this.userName, this.password);

    }

    public boolean passwordVerifier(String password) {

        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!?@#$%^&-+=()])(?=\\S+$).{8,}$";

        return password.matches(regex);
    }

    public void editDetails(Accounts[] acc, int noa, int id) {

        Scanner input = new Scanner(System.in);

        for (int x = 0; x < noa; x++) {

            System.out.print("\nEnter New eMail: ");
            String em = input.nextLine();
            acc[x].eMail = em;

            System.out.print("Enter New Username: ");
            String un = input.nextLine();
            acc[x].userName = un;

            while (true) {
                System.out.print("Enter New Password: ");
                String pw = input.nextLine();
                acc[x].password = pw;

                if (acc[x].passwordVerifier(pw)) {
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
        }
    }

    public void removeAccount(Accounts[] acc, int noa, int id) {

        for (int x = 0; x < noa; x++) {
            if (acc[x].id == id) {
                System.out.printf("Removing account with User ID: %d", id);
                for (int i = x; i < noa; i++) {
                    acc[i] = acc[i + 1];
                }
                System.out.println("\nAccount Removed Successfully.");
                noa--;
            } else {
                System.out.println("User ID not found.");
            }
        }

    }
}
