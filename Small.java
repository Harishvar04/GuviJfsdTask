import java.util.*;
public class Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2 Number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3  Number:");
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3 ){
            System.out.println("The Smallest is "+ num1);
        }
        else if(num2 < num1 && num2 < num3){
            System.out.println("The Smallest is "+ num2);

        }
        else{
            System.out.println("The Smallest is "+ num3);
        }



    }
}
