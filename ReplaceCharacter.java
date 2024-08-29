import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        System.out.println("Enter the first character to replace:");
        char ch1 = scanner.next().charAt(0);

        System.out.println("Enter the second character to replace:");
        char ch2 = scanner.next().charAt(0);

        // Convert to character array and replace characters
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch1) chars[i] = ch2;
            else if (chars[i] == ch2) chars[i] = ch1;
        }

        // Print the modified string
        System.out.println("Modified string: " + new String(chars));
        scanner.close();
    }
}
