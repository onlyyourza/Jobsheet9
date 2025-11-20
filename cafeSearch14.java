import java.util.Scanner;
public class cafeSearch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Fried Rice", "Fried Noodles", "Toasted Bread",
            "Fried Potatoes", "Teh Tarik", "Cappuccino",
            "Chocolate Ice"
        };

        System.out.println("===== CAFÉ MENU =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println();

        System.out.print("Enter the item you want to search for: ");
        String searchItem = sc.nextLine();

        int index = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchItem)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The item \"" + searchItem + "\" is AVAILABLE on the menu!");
        } else {
            System.out.println("The item \"" + searchItem + "\" is NOT on the menu.");
        }
        sc.close();
    }
}
