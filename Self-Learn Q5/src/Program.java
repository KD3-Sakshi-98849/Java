
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int specialCharacters = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {

                    vowels++;
                } else {
                    consonants++;
                }

            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                specialCharacters++;
            }
        }

        int totalCharacters = text.length();

        System.out.println("\nText Statistics");
        System.out.println("----------------------");
        System.out.println("Total Characters   : " + totalCharacters);
        System.out.println("Vowels             : " + vowels);
        System.out.println("Consonants         : " + consonants);
        System.out.println("Digits             : " + digits);
        System.out.println("Spaces             : " + spaces);
        System.out.println("Special Characters : " + specialCharacters);

        sc.close();
    }
}