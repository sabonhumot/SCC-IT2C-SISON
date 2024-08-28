package javaapplication78;
import java.util.Scanner;


public class netPayy {
      
    public void Salary() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of Employees: ");
        int noOfEmp = input.nextInt();
        
            for(int x = 1; x < noOfEmp; x++) {
                System.out.printf("Details of Employee %d\n", x);
                
                System.out.print("Employee ID: ");
                int eid = input.nextInt();
                input.nextLine();
                
                System.out.print("Name: ");
                String ename = input.nextLine();
                
                System.out.print("Rate (hourly): ");
                int erate = input.nextInt();
                
                System.out.println("Hours Worked: ");
                int ehours = input.nextInt();
                
                System.out.println("Total Deduction: ");
                int td = input.nextInt();
                                
            }     
    }
    
    public void Salaries () {
        
    }
    
}
