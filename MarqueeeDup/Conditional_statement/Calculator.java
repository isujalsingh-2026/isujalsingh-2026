package MarqueeeDup.Conditional_statement;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        int b = sc.nextInt();

        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b == 0)
                    System.out.println("Zero Division Error");
                else
                    System.out.println(a/b);
                break;
            case '%':
                if(b == 0)
                    System.out.println("Zero Division Error");
                else
                    System.out.println(a%b);
                break;

            default:
                System.out.println("Enter valid operation");
                break;
        }
    }
}
