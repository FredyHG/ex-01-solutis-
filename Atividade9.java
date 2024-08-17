import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        long roundedArea = Math.round(area);

        System.out.println("The rounded area of the circle is: " + roundedArea);

        sc.close();
    }
}
