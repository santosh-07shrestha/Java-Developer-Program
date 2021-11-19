package ProductList;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {
    LinkedList<Product> products; // list works as database
    Scanner scan = new Scanner(System.in);

    public ProductDaoImpl() {
        products = new LinkedList<Product>();
        Product product1 = new Product(1, "TV", 2, 200);
        Product product2 = new Product(2, "AC", 1, 100);
        Product product3 = new Product(3, "laptop", 1, 2100);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    @Override
    public void addProducts() {
        int k = 1;
        while (k == 1) {
            System.out.println("Enter the product id: ");
            int pid = scan.nextInt();
            System.out.println("Enter the product name: ");
            String pname = scan.next();
            System.out.println("Enter the product quantity: ");
            int qty = scan.nextInt();
            System.out.println("Enter the product price: $");
            int price = scan.nextInt();
            Product product4 = new Product(pid, pname, qty, price);
            products.add(product4);
            System.out.println("Added Successfully");
            System.out.println("Do you want to add one more records: Press Yes(1) otherwise 0");
            k = scan.nextInt();
        }

    }

    @Override
    public LinkedList<Product> viewProducts() {
        System.out.println("PID\t\tName\t\tQuantity\tPrice($)");
        for (Product product : products) {
            System.out.println(product.getPid() + "\t\t" + product.getPname() + "\t\t" + product.getQty() + "\t\t"
                    + product.getPrice());
        }
        return products;
    }

    @Override
    public LinkedList<Product> viewProduct(int pid) {

        System.out.println("PID\t\tName\t\tQuantity\tPrice($)");
        for (Product product : products) {
            if (product.getPid() == pid)
                System.out.println(product.getPid() + "\t\t" + product.getPname() + "\t\t" + product.getQty() + "\t\t"
                        + product.getPrice());
        }
        return products;
    }

    @Override
    public void updateProduct(int pid) {
        int k = 0;
        for (Product product : products) {
            if (product.getPid() == pid) {
                k++;
                System.out.println("Enter product new name: ");
                product.setPname(scan.next());
                System.out.println("Enter product new quantity: ");
                product.setQty(scan.nextInt());
                System.out.println("Enter product new price: ");
                product.setPrice(scan.nextInt());
            }
        }
        if (k == 0)
            System.out.println("Product ID not available");
    }

    @Override
    public void deleteProduct(int pid) {
        int k = 0;
        for (Product product : products) {
            if (product.getPid() == pid) {
                k++;
                products.remove(product);
                System.out.println("Student record deleted");
            }
        }
        if (k == 0)
            System.out.println("Record not found");

    }
}