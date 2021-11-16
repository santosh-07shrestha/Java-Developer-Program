package LoginReg.Product;

public class Product {
    int pid;
    String pname;
    String dept;
    Double price;

    public Product(int pid, String pname, String dept, Double price) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.dept = dept;
        this.price = price;
    }

    public Product() {
        super();
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
