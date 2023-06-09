package lesson_1;

public class Sport_Car extends Car{
    public Sport_Car(String name, int id, String color) {
        super(name, id, color);
    }

    @Override
    public String start() {
        return "VRRRRRRRRRRR";
    }
}
