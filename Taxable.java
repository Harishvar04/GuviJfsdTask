package oops;

public interface Taxable {
     double salesTax = 0.07;
     double incomeTax = 0.105;

     public double calcTax();

}
class Employee implements Taxable{
    int empId;
    String name;
    double salary;

    public Employee(int empId,String name,double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;

    }
    public double calcTax(){
        double  yearly = salary * 12;
        double tax = yearly - (yearly * incomeTax);
        return tax;
    }
}
class Product implements Taxable{
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcTax(){
        double tax =price - (price * salesTax);
        return tax;
    }

}
