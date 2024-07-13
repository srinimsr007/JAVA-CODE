import java.util.Scanner;

public class CompleteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        boolean isComplete = true;
        for (boolean b : alphabet) {
            if (!b) {
                isComplete = false;
                break;
            }
        }

        if (isComplete) {
            System.out.println("Yes, it's a complete string.");
        } else {
            System.out.println("No, it's not a complete string.");
        }
    }
}
