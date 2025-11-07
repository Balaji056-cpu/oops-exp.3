import java.util.*;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph of text:");
        String input = sc.nextLine();

        String vowelsList = "";
        String consonantsList = "";
        int vowelCount = 0, consonantCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowelsList += c + ", ";
                    vowelCount++;
                } else {
                    consonantsList += c + ", ";
                    consonantCount++;
                }
            }
        }

        // Remove trailing commas for clean output
        if (vowelsList.endsWith(", ")) vowelsList = vowelsList.substring(0, vowelsList.length() - 2);
        if (consonantsList.endsWith(", ")) consonantsList = consonantsList.substring(0, consonantsList.length() - 2);

        System.out.println("Vowels are: " + vowelsList + ", Total = " + vowelCount);
        System.out.println("Consonants are: " + consonantsList + ", Total = " + consonantCount);

        sc.close();
    }
}
