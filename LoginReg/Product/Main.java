package LoginReg.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProductFunc pf = new ProductFunc();
        while (true) {
            System.out.println(
                    "1.Add Product\n2.View All Product\n3.View Product\n4.Update Product\n5.Delete Product\n6.Exit");
            System.out.println("Select your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                pf.addProducts();
                break;
            case 2:
                Product[] viewProducts = pf.viewAllProducts();
                for (Product pro : viewProducts) {
                    if (pro != null) {
                        System.out.println(
                                pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getDept() + "\t" + pro.getPrice());
                    }
                }
                break;
            case 3:
                System.out.println("Enter product id to view: ");
                Product pro = pf.viewProduct(scan.nextInt());
                if (pro != null) {
                    System.out.println(
                            pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getDept() + "\t" + pro.getPrice());
                } else {
                    System.out.println("Product Record not found");
                }
                break;
            case 4:
                System.out.println("Enter product number: ");
                pf.updateProduct(scan.nextInt());
                break;
            case 5:
                System.out.println("Enter product numbrer to delete:  ");
                pf.deleteProduct(scan.nextInt());
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Please select the correct option.");
                break;
            }
        }
    }
}
