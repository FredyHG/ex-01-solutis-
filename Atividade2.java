import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int value1 = sc.nextInt();

        System.out.print("Enter the second value: ");
        int value2 = sc.nextInt();

        int larger = (value1 > value2) ? value1 : value2;
        System.out.println("The larger value is: " + larger);

        sc.close();
    }
}