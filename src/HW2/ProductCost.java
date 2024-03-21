package HW2;

import java.util.Scanner;

public class ProductCost {
    public static void main(String[] args) {
        float pricePerUnit = Float.parseFloat(args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity of the product you want to purchase: ");
        int quantity = scanner.nextInt();

        float totalPrice = calculateTotalPrice(pricePerUnit, quantity);
        System.out.println("Total product price: " + totalPrice);

        scanner.close();
    }

    public static float calculateTotalPrice(float pricePerUnit, int quantity) {
        float discount = 0.0f;

        if (quantity > 80) {
            discount = 0.13f;
        } else if (quantity > 30) {
            int additionalUnits = quantity - 30;
            discount = 0.12f + ((float) additionalUnits / 10) * 0.004f;
        } else if (quantity > 20) {
            discount = 0.10f;
        } else if (quantity > 10) {
            discount = 0.05f;
        }

        float discountedPrice = pricePerUnit * (1 - discount);
        return discountedPrice * quantity;
    }
}
