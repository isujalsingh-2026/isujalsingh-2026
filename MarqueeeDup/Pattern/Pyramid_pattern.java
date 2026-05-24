package MarqueeeDup.Pattern;

import java.util.Scanner;

public class Pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {     // j <= 2*i-1   for odd pyramid
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
