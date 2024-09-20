package javaapplication78;

import java.util.Scanner;

public class Products {

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
        System.out.printf("%-10d %-15s %-10.2f %-10d %-10d %-10.2f %-10s %-25.2f\n",
                this.id, this.name, this.price, this.sold, this.stock, profit, status, tep);

    }

    public void editProd(Products[] pd, int nop, int id) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nop; i++) {
            if (pd[i].id == id) {

                System.out.print("\nEnter New Price: ");
                int price = input.nextInt();
                pd[i].price = price;

                System.out.print("Enter New Items Sold: ");
                int is = input.nextInt();
                pd[i].sold = is;

                System.out.print("Enter New Stock: ");
                int stock = input.nextInt();
                pd[i].stock = stock;
            } else {
                System.out.println("Product ID not found.");
            }
        }
    }
    
    public void removeProd(Products [] pd, int nop, int id) {
        
        for(int x = 0; x < nop; x++) {
            if (pd[x].id == id) {
                System.out.printf("Removing Product with ID: %d", id);
                for (int i = x; i < nop; i++) {
                    pd[i] = pd[i + 1];
                }
                System.out.println("\nProduct Successfully Removed.");
                nop--;
            } else {
                System.out.println("Product ID not found.");
            }
        }
    }
}
