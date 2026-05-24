package MarqueeeDup.Pattern;
import java.util.Scanner;

public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=i; j++) { // (2 * i - 1)
                System.out.print("* ");
            }
            System.out.println();//Pyramid Triangle
        }

        for (int i=n; i>=1; i--) {
            for (int j=1; j<=n-i ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();//Inverted Pyramid triangle
        }
    }
}
