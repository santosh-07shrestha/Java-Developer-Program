package LoginReg.Product;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ProductFunc {
    Scanner scan = new Scanner(System.in);
    static Product[] addProducts = new Product[1];

    public void addProducts() {
        for (int i = 0; i < addProducts.length; i++) {
            System.out.println("Enter the product id: ");
            int pid = scan.nextInt();
            System.out.println("Enter the product name: ");
            String pname = scan.next();
            System.out.println("Enter the department name: ");
            String dept = scan.next();
            System.out.println("Enter the product price: $");
            Double price = scan.nextDouble();

            Product pro = new Product(pid, pname, dept, price); // parameterized constructor
            addProducts[i] = pro;
            System.out.println("Product added successfully. Thank you.");
        }
    }// addProduct() ends

    Product[] viewAllProducts() {
        return addProducts;
    }

    public Product viewProduct(int pid) {
        for (Product pro : addProducts) {
            if (pro.getPid() == pid) {
                return pro;
            }
        }
        return null;
    }

    public void deleteProduct(int pid) {
        int i = 0;
        int j = 0;
        for (Product pro : addProducts) {
            if (pro.getPid() == pid) {
                addProducts[i] = null;
                System.out.println("Student record deleted successfully.");
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (j == 0) {
            System.out.println("Record not found.");
        }
    }

    public void updateProduct(int pid) {
        int j = 0;
        for (Product pro : addProducts) {
            if (pro.getPid() == pid) {
                System.out.println(
                        "Would you like to update product info?\n1.Product Name Update or 2.Department Name Update or 3.Product Price Update");
                int choice = scan.nextInt();
                j++;
                switch (choice) {
                case 1:
                    System.out.println("Enter new product name: ");
                    String name = scan.next();
                    pro.setPname(name); // updates product name
                    System.out.println("Product name updated successfully.");
                    break;
                case 2:
                    System.out.println("Enter new product department: ");
                    String deptname = scan.next();
                    pro.setDept(deptname);
                    System.out.println("Department name updated successfully.");
                    break;
                case 3:
                    System.out.println("Enter new product price: $");
                    Double pprice = scan.nextDouble();
                    pro.setPrice(pprice);
                    System.out.println("Product Price updated successfully.");
                    break;
                default:
                    System.out.println("Please make appropriate selection from menu.");
                    break;
                }
            }
        }
        if (j == 0) {
            System.out.println("Record not found.");
        }
    }
}
