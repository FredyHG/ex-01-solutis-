import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalKilometers = 0;
        int totalLiters = 0;

        char continueInput = 'y';

        while (continueInput == 'y' || continueInput == 'Y') {
            System.out.print("Enter the kilometers driven: ");
            int kilometers = sc.nextInt();

            System.out.print("Enter the liters of gasoline consumed: ");
            int liters = sc.nextInt();

            double kmPerLiter = (double) kilometers / liters;
            System.out.printf("The fuel consumption for this tank was %.2f km/l.%n", kmPerLiter);

            totalKilometers += kilometers;
            totalLiters += liters;

            System.out.printf("Total mileage so far: %d km.%n", totalKilometers);
            System.out.printf("Total liters consumed so far: %d liters.%n", totalLiters);

            System.out.print("Do you want to enter data for another tank? (y/n): ");
            continueInput = sc.next().charAt(0);
        }

        sc.close();
    }
}
