package MarqueeeDup.Conditional_statement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String roll = sc.nextLine();

        switch (roll) {
            case "admin":
                System.out.println("Full Access");
                break;
            case "student":
                System.out.println("Only Student Portal");
                break;
            case "teacher":
                System.out.println("Teacher & Student Portal");
                break;
            case "Guest":
                System.out.println("View Only");
                break;

            default:
                System.out.println("Enter valid roll");
                break;
        }
    }
}
