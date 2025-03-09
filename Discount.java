import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Purchase amount:");
        int purchaseAmount = sc.nextInt();
        double  finalPrice;
        if(purchaseAmount < 500 ){
            finalPrice = purchaseAmount;
            System.out.println(finalPrice);
        }else if(purchaseAmount >= 500 && purchaseAmount <= 1000){
            finalPrice= purchaseAmount-(purchaseAmount * 0.1);
        }
        else{
            finalPrice= purchaseAmount-(purchaseAmount * 0.2);
        }
        System.out.println("The Price After Discount is :"+ finalPrice);

    }
}
