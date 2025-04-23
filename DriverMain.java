package oops;
import java.util.*;
public class DriverMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Details:");
        System.out.print("ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(empId, name, salary);
        double result1 = emp.calcTax();
        System.out.println(result1);
        // Input for Product
        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Product prod = new Product(pid, price, quantity);
        double result2=prod.calcTax();
        System.out.println(result2);
    }
}
