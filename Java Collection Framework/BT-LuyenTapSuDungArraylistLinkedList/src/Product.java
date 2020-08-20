public class Product implements Comparable<Product>{
    private static int count;
    private String tenSP;
    private int giaSP;
    private int id;

    Product() {
    }

    Product(String tenSP, int giaSP) {
        count++;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.id=count;

    }

    public int getId() {
        return id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }

    @Override
    public String toString() {
        return "ID :" + id +", TEN SAN PHAM: " + tenSP +", DON GIA SAN PHAM: " + giaSP;
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(getGiaSP(), o.getGiaSP());
    }
}
