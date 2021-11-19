package ProductList;

import java.util.Scanner;

public class ProductClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProductDao productDao = new ProductDaoImpl();
        while (true) {
            System.out.println(
                    "1.Add Products\n2.View All Products.\n3.Search product with pid\n4.Update product with pid:\n5.Delete Product\n6.Exit");
            switch (scan.nextInt()) {
            case 1:
                productDao.addProducts();
                productDao.viewProducts();
                break;
            case 2:
                System.out.println("List of products are as follows: ");
                productDao.viewProducts();
                break;
            case 3:
                System.out.println("Enter the pid to lookup: ");
                productDao.viewProduct(scan.nextInt());
                break;
            case 4:
                System.out.println("Enter pid to update: ");
                productDao.updateProduct(scan.nextInt());
                productDao.viewProducts();
                break;
            case 5:
                System.out.println("Enter pid to be deleted: ");
                productDao.deleteProduct(scan.nextInt());
                productDao.viewProducts();
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Please select appropriate from menu.");
                break;
            }
        }
    }
}