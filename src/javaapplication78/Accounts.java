package javaapplication78;

public class Accounts {
    
    int id;
    String name, eMail, userName;
    
        public void addDetails (int uid, String uName, String uem, String user, String password) {
            
            this.id = uid;
            this.name = uName;
            this.eMail = uem;
            this.userName = user;
        }
        
        public void viewDetails () {
            
            System.out.println("-------------------------------------------------------------------------------\n");
            System.out.printf("%-15s %-15s %-15s %-15s %-15s", "User ID", "Name", "eMail", "Username", "Password");
            System.out.println("-------------------------------------------------------------------------------\n");
            System.out.printf("%-15d %-15s %-15s %-15s %-15s",  this.id, this.name, this.eMail, this.userName);
        }
        
        public boolean passwordVerifier (String passWord) {
            
            String specialChars = ".*[?!@#$%^&*()_+-=]*.";
            
                if(passWord.length() < 8) {
                    System.out.println("Password too short, please try again.");
                    //return false;
                }
                else if (!passWord.matches(".*[A-Z]*.")) {
                    System.out.println("Password must contain atleast one uppercase letter, please try again.");
                    //return false;
                }
                else if (!passWord.matches(specialChars)) {
                    System.out.println("Password must contain atleast one special character, please try again.");
                    //return false;
                }
                else if (!passWord.matches(".*\\d*.")) {
                    System.out.println("Password must contain atleast one number, please try again.");
                    //return false;
                }
               
                return true;
                
        }

}

