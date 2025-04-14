package OOPS;

public class Person {
     private int age = 18;
     private String name;
     //Default of age of person is initialized as 18.
     public Person(String name){
         this.name = name;
         this.age=age;

     }

     // Initializing name and age with the person object.
     public Person(String name,int age) {
         this.name = name;
         this.age = age;
     }

     // Function to display the Person details name and age.
     public void display(){
         System.out.println("NAME :"+name+",AGE:"+age);

     }
    public static void main(String[] args){
         Person person1 = new Person("harish");
         person1.display();

         Person person2 = new Person("arun",17);
         person2.display();
    }

}
