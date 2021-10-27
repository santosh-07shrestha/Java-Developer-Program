package Lecture6;

import java.util.Scanner;

public class DrinksDetail {
    Scanner scan = new Scanner(System.in);
    int choice, count, coke_bill, sprite_bill, tea_bill, coffee_bill;
    int coke_price = 10, sprite_price = 5, tea_price = 2, coffee_price = 6;
    static double total_drinks_bill;

    public void softdrinksMenu() {
        System.out.println("1.Coke\n2.Sprite\n3.Back");
        choice = scan.nextInt();

        switch (choice) {
        case 1:
            coke();
            softdrinksMenu();
            break;
        case 2:
            sprite();
            softdrinksMenu();
            break;
        case 3:
            drinksMenu();
            break;
        default:
            System.out.println("Please select appropriate menu.");
            break;
        }

    }

    public void hotdrinksMenu() {
        System.out.println("1.Tea\n2.Coffee\n3.Back");
        choice = scan.nextInt();
        switch (choice) {
        case 1:
            tea();
            hotdrinksMenu();
            break;
        case 2:
            coffee();
            hotdrinksMenu();
            break;
        case 3:
            drinksMenu();
            break;
        default:
            System.out.println("Please select appropriate menu.");
            break;
        }

    }

    public void coke() {
        System.out.println("\nHow many coke?");
        count = scan.nextInt();
        coke_bill = count * coke_price;
        System.out.println("Coke Bill: $" + coke_bill);
        total_drinks_bill += coke_bill;
    }

    public void sprite() {
        System.out.println("\nHow many sprite?");
        count = scan.nextInt();
        sprite_bill = count * sprite_price;
        System.out.println("Sprite Bill: $" + sprite_bill);
        total_drinks_bill += sprite_bill;
    }

    public void tea() {
        System.out.println("\nHow many tea?");
        count = scan.nextInt();
        tea_bill = count * tea_price;
        System.out.println("Tea Bill: $" + tea_bill);
        total_drinks_bill += tea_bill;
    }

    public void coffee() {
        System.out.println("\nHow many coffee?");
        count = scan.nextInt();
        coffee_bill = count * coffee_price;
        System.out.println("Coffee Bill: $" + coffee_bill);
        total_drinks_bill += coffee_bill;
    }

    public void drinksMenu() {
        System.out.println("1.Soft Drinks\n2.Hot Drinks\n3.Back");
        choice = scan.nextInt();
        while (true) {
            switch (choice) {
            case 1:
                softdrinksMenu();
                drinksMenu();
                break;
            case 2:
                hotdrinksMenu();
                drinksMenu();
                break;
            case 3:
                RestaurantClient.main(null);
                break;
            default:
                System.out.println("Please select appropriate menu.");
                break;
            }

        }

    }

}
