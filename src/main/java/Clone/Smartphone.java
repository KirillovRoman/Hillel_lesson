package Clone;

public class Smartphone implements Cloneable{
    private String brand;

    @Override
    protected Smartphone clone() throws CloneNotSupportedException {
        return new Smartphone(brand);
    }

    public Smartphone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
