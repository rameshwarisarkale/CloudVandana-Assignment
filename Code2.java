import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine().toLowerCase();

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    private static boolean isPangram(String sentence) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }
        return uniqueChars.size() == 26;
    }
}