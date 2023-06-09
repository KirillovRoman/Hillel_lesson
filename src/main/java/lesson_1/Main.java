package lesson_1;

public class Main {
    public static void main(String[] args) {
        try {
            Car sportCar = new Sport_Car("toyota", 549435, "Red");
            Car electricCar = new Electric_Car("tesla", 100456, "Light_blue");

            System.out.println(run(sportCar));
            System.out.println(run(electricCar));
        } catch (Exception e){
            System.out.println("Exception!!!");
        }

    }

    public static String run(Car car){
        Sport_Car sportCar = (Sport_Car) car;
        return sportCar.start();
    }
}
