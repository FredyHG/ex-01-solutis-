import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println("The day of the week is: " + daysOfWeek[dayNumber - 1]);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}
