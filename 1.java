import java.util.*;
public class CountLettersDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int letters = 0, digits = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c))
                letters++;
            else if (Character.isDigit(c))
                digits++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);

        sc.close();
    }
}
