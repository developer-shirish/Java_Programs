package c.javaprojects.Palindrome;

import java.util.Scanner;

/**
 * Created by shirish on 18/4/17.
 */

public class Palindrom {
    public static void main(String[] args) {

        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);

        original = scanner.nextLine();

        int length = original.length();

        for (int i = length - 1 ; i >= 0; i--) {
            reverse = reverse + original.charAt(i);

        }

        if (original.equals(reverse)){
            System.out.println("Palindrom");
        }else
        {
            System.out.println("not palindrom");
        }
    }
}
