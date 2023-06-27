package Clone;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung");
        Student student1 = new Student("Roman", 16, smartphone);
        try {
            Student student2 = (Student) student1.clone();
            student1.setName("Bob");
            smartphone.setBrand("Iphone");
            System.out.println(student2);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
