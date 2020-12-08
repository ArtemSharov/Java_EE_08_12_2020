public class Product {
    private final int id;
    private String title;
    private double coast;

    public Product(int id, String title, double coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public String getTitle() {
        return title;
    }


    public int getId() {
        return id;
    }
}
