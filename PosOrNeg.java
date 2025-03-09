import java.util.*;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input to check whether the given input is pos or negative:");
        int i = sc.nextInt(); //Getting input From the user.
        if(i < 0){ // checking for negative number.
            System.out.println("The given input is negative.");
        }
        else{ // This is for printing the output if the given number is positive.
            System.out.print("The given input is positive number.");
        }
    }
}
