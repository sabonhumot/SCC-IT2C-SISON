package javaapplication78;

public class Product {
    
    int id, sold, stock;
    double price;
    String name;
    
        public void addProduct(int pid, String pname, double pprice, int psold, int pstock) {
            
            this.id = pid;
            this.name = pname;
            this.price = pprice;
            this.sold = psold;
            this.stock = pstock;
            
            
    }
        public void viewProduct() {
            double tep = this.price * this.stock;
            double profit = this.price * this.sold;
            
            String status = (this.stock <= 0) ? "Out of Stock" : "Available";
                    
//                if(this.stock >= 0) {
//                   status = "Out of Stock";
//                }
//                else {
//                   status = "Available";
//                }        
            System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10s %-10.2f\n",
                    this.id, this.name, this.price, this.sold, this.stock, profit, status, tep);
            
        }
}
