package javaapplication78;

import java.util.Scanner;

public class Product {

    public void addProd() {

        Products[] pd = new Products[100];
        Scanner input = new Scanner(System.in);
        int noOfProd = 0;
        String choice;

        do {

            System.out.println("Welcome to Product Management App!");
            System.out.println("---------------------------------------------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("---------------------------------------------------------");

            System.out.print("Enter option: ");
            int option = input.nextInt();

            while (option > 5) {
                System.out.println("Invalid Action. Please Try Again.");
                option = input.nextInt();
            }

            Products prod = new Products();

            switch (option) {
                case 1:
                    System.out.print("Enter no of products: ");
                    noOfProd = input.nextInt();

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
                    break;
                case 2:

                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("%10s %-15s %-10s %-10s %-10s %-10s %-10s %-25s", "Product ID", "Product Name", "Price", "Items Sold", "Stock", "Profit", "Status", "Total Estimated Profit");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------");
                    for (int x = 0; x < noOfProd; x++) {
                        pd[x].viewProduct();
                    }
                    break;

                case 3:

                    System.out.print("Enter ID to Update: ");
                    int id = input.nextInt();
                    System.out.printf("ID: %d", id);
                    prod.editProd(pd, noOfProd, id);
                    System.out.println("Product Updated Successfully.");
                    break;

                case 4:
                    System.out.print("Enter ID to Remove: ");
                    id = input.nextInt();
                    System.out.printf("ID: %d", id);
                    prod.removeProd(pd, noOfProd, id);
                    noOfProd--;
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodboye!");
                    System.exit(0);
                    break;
            }
            System.out.print("Do you want to continue? (Y/N): ");
            choice = input.next();

        } while (choice.equals("Y") || choice.equals("y"));

    }
}
