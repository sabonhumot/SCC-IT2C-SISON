
package javaapplication78;

import java.util.Scanner;

public class Product {
    
    public void addProd () {
        
        Products[] pd = new Products[100];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter no of products: ");
        int noOfProd = input.nextInt();
        
            for (int x = 0; x < noOfProd; x++) {
                System.out.printf("Enter details of product %d\n", x + 1);
                
                System.out.print("Product ID: ");
                int id = input.nextInt();
                input.nextLine();
                
                System.out.print("Product Name: ");
                String name = input.nextLine();
                
                System.out.print("Price: ");
                double price = input.nextDouble();
                
                System.out.print("Items Sold: ");
                int sold = input.nextInt();
                
                System.out.print("Stock: ");
                int stock = input.nextInt();
                
                pd[x] = new Products();
                pd[x].addProduct(id, name, price, sold, stock);
                
                
            }
        
        for (int x = 0; x < noOfProd; x++) {
            pd[x].viewProduct();
        }
    }
}
