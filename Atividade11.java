import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = sc.nextLine();

        if (word1.compareTo(word2) < 0) {
            System.out.println("Alphabetical order: " + word1 + ", " + word2);
        } else if (word1.compareTo(word2) > 0) {
            System.out.println("Alphabetical order: " + word2 + ", " + word1);
        } else {
            System.out.println("The words are identical: " + word1);
        }

        if (word1.length() > word2.length()) {
            System.out.println("The word with more characters is: " + word1);
        } else if (word1.length() < word2.length()) {
            System.out.println("The word with more characters is: " + word2);
        } else {
            System.out.println("Both words have the same number of characters.");
        }

        sc.close();
    }
}
