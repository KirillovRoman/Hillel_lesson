public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().setBrand("Audi").setColor("Grey").setModel("R8").setYear(2006).build();
        Car car2 = new Car.Builder().setBrand("Audi").setColor("Grey").setModel("R8").setYear(2006).build();
        Car car3 = new Car.Builder().setBrand("Toyota").setColor("Red").setModel("Camry").setYear(2022).build();

        System.out.println(car.equals(car2));
        System.out.println(car.equals(car3));

        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
