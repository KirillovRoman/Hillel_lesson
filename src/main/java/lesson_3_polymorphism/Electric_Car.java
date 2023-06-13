package lesson_3_polymorphism;

import lesson_3_polymorphism.Car;

public class Electric_Car extends Car {
    public Electric_Car(String name, int id, String color) {
        super(name, id, color);
    }

    @Override
    public String start() {
        return "*silence*";
    }
}
