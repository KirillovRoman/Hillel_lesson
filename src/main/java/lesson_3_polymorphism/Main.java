package lesson_3_polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("honda", 230516, "Grey");
        Car sportCar = new Sport_Car("toyota", 549435, "Red");
        Car electricCar = new Electric_Car("tesla", 100456, "Light_blue");

        System.out.println(run(car));
        System.out.println(run(sportCar));
        System.out.println(run(electricCar));

    }

    public static String run(Car car) {
        return car.start();
    }
}
