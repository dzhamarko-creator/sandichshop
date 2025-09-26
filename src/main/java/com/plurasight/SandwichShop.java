import java.util.Scanner;

public class GarlicSandwichShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask customer for sandwich size
        System.out.println("Enter sandwich size (1 = Regular, 2 = Large): ");
        int size = sc.nextInt();

        double price;
        if (size == 1) {
            price = 5.45; // Regular
        } else {
            price = 8.95; // Large
        }

        // Ask customer for their age
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // Apply  special shop discounts
        if (age <= 17) {
            price = price * 0.90; // 10% discount
        } else if (age >= 65) {
            price = price * 0.80; // 20% discount
        }

        // Show final garlic sandwich cost
        System.out.println("Your sandwich will cost: $" + String.format("%.2f", price));

        sc.close();
    }
}
