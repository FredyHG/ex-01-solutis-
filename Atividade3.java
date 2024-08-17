import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println("Prime numbers less than " + number + ":");

        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
