import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("it a vowel");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("it a consonant");
        } else {
            System.out.println("Not a letter");
        }

        scanner.close();
    }
}