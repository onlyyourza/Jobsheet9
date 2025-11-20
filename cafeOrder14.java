import java.util.Scanner;
public class cafeOrder14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] itemName = new String[n];
        double[] itemPrice = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter food/drink name for order " + (i + 1) + ": ");
            itemName[i] = sc.nextLine();

            System.out.print("Enter price for " + itemName[i] + ": ");
            itemPrice[i] = sc.nextDouble();
            sc.nextLine();
        }

        double totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalCost += itemPrice[i];
        }

        System.out.println("\n=== Cafe Order Summary ===");
        for (int i = 0; i < n; i++) {
            System.out.println(itemName[i] + " - Rp" + itemPrice[i]);
        }
        System.out.println("\nTotal Cost: Rp" + totalCost);
        sc.close();
    }
}
