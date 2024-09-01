package javaapplication78;

public class Salaries {

    int id, rate, hours, td;
    String name;

    
        public void employeeData(int eid, String ename, int erate, int ehours, int etd) {
            
            this.id = eid;
            this.name = ename;
            this.rate = erate;
            this.hours = ehours;
            this.td = etd;
        }
        
        public void viewData() {
            
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("%-15s %-10s %-15s %-20s %-15s", "Employee ID", "Name", "Rate (Hourly)", "Total Hours Worked", "Total Deduction\n");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("%-15d %-10s %-15d %-20d %-15d", this.id, this.name, this.rate, this.hours, this.td);
        }
}
