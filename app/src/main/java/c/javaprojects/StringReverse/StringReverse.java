package c.javaprojects.StringReverse;

import java.util.Scanner;

/**
 * Created by shirish on 18/4/17.
 */

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String original = scanner.nextLine();

        for (int i = original.length() - 1; i >= 0 ; i--) {
            String reverse = String.valueOf(original.charAt(i));
            System.out.print(reverse);

        }
    }
}
