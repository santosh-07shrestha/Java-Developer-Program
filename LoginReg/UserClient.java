package LoginReg;

import java.util.Scanner;

import Lecture8.Product;
import LoginReg.UserDAOImpl;
import Product.Main;

public class UserClient {
    public static void main(String[] args) {
        UserDAOImpl daoImpl = new UserDAOImpl();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                daoImpl.register();
                break;
            case 2:
                System.out.print("Enter login email: ");
                String email = scan.next();
                System.out.print("Enter PassWord: ");
                String password = scan.next();
                boolean flag = daoImpl.verifyUser(email, password);
                if (flag) {
                    System.out.println("Welcome, " + email);
                    Main m = new Main();
                    m.main(null);
                } else {
                    System.out.println("Email and password did not match. Try Again...");

                }
                break;
            case 3:
                System.out.println("Exit");
                System.exit(0);

            }
        }
    }

}
