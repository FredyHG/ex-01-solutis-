public class Atividade6 {
    public static void main(String[] args) {
        int productInt = 1;
        float productFloat = 1.0f;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                productInt *= i;
                productFloat *= i;
            }
        }

        System.out.println("Product of odd numbers from 15 to 30 (int): " + productInt);
        System.out.println("Product of odd numbers from 15 to 30 (float): " + productFloat);
    }
}
