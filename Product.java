package OOPS;

import java.util.Scanner;

public class Product {
    public  int pid;
    public  int price;
    public int quantity;

    public Product(int pid,int price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

}
class ProductMain{
    // c. Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }
    public static void main(String[] args) {
        Product[] products = new Product[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5;i++) {
            System.out.println("Enter the ProductId for" + (i+1));
            int pid = sc.nextInt();
            System.out.print("Price :");
            int price = sc.nextInt();
            System.out.print("quantity :");
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }
            // b. Find pid of the product with the highest price
            double maxPrice = products[0].price;
            int maxPricePid = products[0].pid;

            for (int i = 1; i < products.length; i++) {
                if (products[i].price > maxPrice) {
                    maxPrice = products[i].price;
                    maxPricePid = products[i].pid;
                }
            }


            System.out.println("\nProduct with highest price has PID: " + maxPricePid);

            // c. Calculate and print total amount spent
            double totalAmount = calculateTotalAmount(products);
            System.out.println("Total amount spent on all products: " + totalAmount);

            sc.close();

        }
    }

