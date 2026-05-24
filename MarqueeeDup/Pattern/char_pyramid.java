package MarqueeeDup.Pattern;
import java.util.Scanner;

public class char_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            //spaces
            for (int j = 0; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i -1; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
