import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting the Greater Value");

        System.out.print("Enter first character: ");
        String input1 = scanner.next();
        char char1 = input1.charAt(0);

        System.out.print("Enter second character: ");
        String input2 = scanner.next();
        char char2 = input2.charAt(0);

        char greaterChar = (char) Math.max(char1, char2);

        System.out.println("\nThe character with the greater value is: " + greaterChar);

        System.out.println("\nShowing the ASCII Codes");
        System.out.println(char1 + ": " + (int) char1);
        System.out.println(char2 + ": " + (int) char2);
    }
}
