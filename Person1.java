package OOPS;

public class Person1 {
    protected String name;
    protected int age;

    public Person1(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person1{
    long EmployeeId;
    int salary;

    public Employee(String name,int age,long EmployeeId,int salary) {
        super(name,age);
        this.EmployeeId = EmployeeId;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("harish",21,1235678910L,20000);
        emp.displayPersonInfo();
    }
}
