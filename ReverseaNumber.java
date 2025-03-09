import java.util.*;


public class ReverseaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number Reverse :");
        int number = sc.nextInt();
        int rev = 0;
        int rem = 0;
        while(number > 0){  // Check for the condition whether the number is always > 0 to find the last digit in a number.
            rem  = number % 10;
            rev =(rev * 10) + rem;
            number = number / 10;
        }
        System.out.print("The Reverse Of the given number is :"+ rev);
    }
}
