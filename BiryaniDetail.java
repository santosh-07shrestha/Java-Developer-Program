package Lecture6;

import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class BiryaniDetail {
    Scanner scan = new Scanner(System.in);
    int chicken_price = 100;
    int mutton_price = 200;
    int veg_price = 50;
    static int total_biryani_bill; // static can be used until the application ends
    int chicken_bill, mutton_bill, veg_bill;

    public int chickenBiryani() {
        System.out.println("\nHow many chicken biryani plates?");
        int plates = scan.nextInt();
        chicken_bill = plates * chicken_price;
        System.out.println("Chicken Bill: " + chicken_bill);
        total_biryani_bill += chicken_bill;
        return plates;
    }

    public void muttonBiryani() {
        System.out.println("\nHow many mutton biryani plates?");
        int plates = scan.nextInt();
        mutton_bill = plates * mutton_price;
        System.out.println("Mutton Bill: " + mutton_bill);
        total_biryani_bill += mutton_bill;
    }

    public void vegBiryani() {
        System.out.println("\nHow many vegetable biryani plates?");
        int plates = scan.nextInt();
        veg_bill = plates * veg_price;
        System.out.println("Mutton Bill: " + veg_bill);
        total_biryani_bill += veg_bill;
    }

    public void biryaniMenu() {
        System.out.println("\n1.Chicken Biryani\n2.Mutton Biryani\n3.Vegetable Biryani\n4.Back");
        int choice = scan.nextInt();
        switch (choice) {
        case 1:
            chickenBiryani();
            biryaniMenu(); // keep the same biryani screen
            break;
        case 2:
            muttonBiryani();
            biryaniMenu();
            break;
        case 3:
            vegBiryani();
            biryaniMenu();
            break;
        case 4:
            RestaurantClient.main(null);
            break;
        default:
            System.out.println("Please select the appropriate option from the menu...");
            break;
        }
    }
}