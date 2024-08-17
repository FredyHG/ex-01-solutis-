import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();

        double kilometers = miles * 1.609;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

        sc.close();
    }
}
