package MarqueeeDup.Pattern;
import java.util.Scanner;

public class Staircase_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=6;
        int stars = 3;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=stars; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            if (i%2==0) {
                stars += 2;
            }
        }
    }
}
