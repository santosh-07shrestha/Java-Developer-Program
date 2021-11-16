package LoginReg;

public interface UserDAO {
    void register();

    public boolean verifyUser(String email, String password);
}
