package ProductList;

import java.util.LinkedList;

public interface ProductDao {
    public void addProducts();

    public LinkedList<Product> viewProducts();

    public LinkedList<Product> viewProduct(int pid);

    public void updateProduct(int pid);

    public void deleteProduct(int pid);
}
