package javaapplication78;

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

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-20s %-15s %-20s", "User ID", "Name", "eMail", "Username", "Password");
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.printf("%-15d %-15s %-20s %-15s %-20s", this.id, this.name, this.eMail, this.userName, this.password);

    }

    public boolean passwordVerifier(String password) {

        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!?@#$%^&-+=()])(?=\\S+$).{8,}$";

        return password.matches(regex);
    }
}
