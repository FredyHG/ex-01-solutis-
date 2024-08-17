public class Atividade10 {
    public static void countCharacters(String input) {
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of spaces: " + spaces);
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        countCharacters(input);
    }
}
