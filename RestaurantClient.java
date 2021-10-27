package Lecture6;

import java.util.Scanner;

public class RestaurantClient {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Biryani\n2.Drinks\n3.Ice-Cream\n4.Billing\n5.Exit");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                BiryaniDetail birobj = new BiryaniDetail();
                birobj.biryaniMenu();
                break;
            case 2:
                DrinksDetail drinkObject = new DrinksDetail();
                drinkObject.drinksMenu();
                break;
            case 3:
                System.out.println("Ice-Cream is out of stock.");
                break;
            case 4:
                System.out.println("\nTotal Biryani Bill: $" + BiryaniDetail.total_biryani_bill);
                System.out.println("Total Drinks Bill: $" + DrinksDetail.total_drinks_bill);
                System.out.println("************");
                System.out.println(
                        "Grand Total Bill: $" + (BiryaniDetail.total_biryani_bill + DrinksDetail.total_drinks_bill));
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Thank you for visiting us...");
                break;
            }

        }
    }
}
