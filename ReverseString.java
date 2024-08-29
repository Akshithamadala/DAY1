import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine(); 
        
        // Split the input string into words and reverse their order using StringBuilder
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();
        
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        
        // Print the result, trimming any trailing space
        System.out.println("Reversed string: " + reversedString.toString().trim());
        
        scanner.close();
    }
}
