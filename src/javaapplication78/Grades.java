
package javaapplication78;


public class Grades {
    
    int id;
    String name;
    double pl, m, pf, f;
    
        public void addGrades(int sid, String sname, double spl, double sm, double spf, double sf) {
            
            this.id = sid;
            this.name = sname;
            this.pl = spl;
            this.m = sm;
            this.pf = spf;
            this.f = sf;    
            
            
        }
        
        public void viewGrades() {
            double ave = (this.pl + this.m + this.pf + this.f) / 4;
            String remarks = (ave > 3.0) ? "Failed" : "Passed";
            
            
            System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", this.id, this.name, this.pl, this.m, this.pf, this.f, ave, remarks);
        }
}
