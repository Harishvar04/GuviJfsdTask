import java.util.Scanner;

import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= j) {
                    System.out.print(n - j);
                } else {
                    System.out.print(n - i);
                }

            }
            System.out.println();
        }
    }

}

