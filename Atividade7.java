public class Atividade7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultInt = i / 2;

                double resultDouble = (double) i / 2;

                System.out.println("Number: " + i + " | Division by 2 (int): " + resultInt + " | Division by 2 (double): " + resultDouble);
            }
        }
    }
}
