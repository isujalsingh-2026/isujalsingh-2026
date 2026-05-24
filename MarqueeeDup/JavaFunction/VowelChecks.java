package MarqueeeDup.JavaFunction;

import java.util.Scanner;

public class VowelChecks {
    static boolean isVowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            return true;
        }
        return false;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println(isVowel('z'));

    }
}
