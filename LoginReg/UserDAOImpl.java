package LoginReg;

import java.util.Scanner;

public class UserDAOImpl implements UserDAO {
    private User addRecords = new User();
    Scanner scan = new Scanner(System.in);

    @Override
    public void register() {
        System.out.println("Enter userid: ");
        int id = scan.nextInt();
        System.out.println("Enter first name: ");
        String fname = scan.next();
        System.out.println("Enter last name: ");
        String lname = scan.next();
        System.out.println("Enter email: ");
        String email = scan.next();
        System.out.println("Enter password: ");
        String password = scan.next();
        System.out.println("Enter mobile: ");
        Long mn = scan.nextLong();

        User user = new User(id, fname, lname, email, password, mn);
        addRecords = user;
        System.out.println("User registered Successfully");
    }

    @Override
    public boolean verifyUser(String email, String password) {
        boolean flag = false;
        // User user;
        User user = addRecords;
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            flag = true;
            return flag;
        }
        return flag;
    }

}
