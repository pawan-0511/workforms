import java.util.HashSet;
import java.util.Scanner;
public class PangramChecker {
    public static boolean checkPangram(String sentence) {
        sentence = sentence.replaceAll(" ", "").toLowerCase();
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }
        return uniqueChars.size() == 26;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        boolean isPangram = checkPangram(sentence);
        if (isPangram) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }
    }
}
    