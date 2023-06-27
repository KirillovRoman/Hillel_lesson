package Clone;

public class Student implements Cloneable{
    private String name;
    private int age;
    private Smartphone smartphone;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return new Student(name, age, smartphone.clone());
    }

    public Student(String name, int age, Smartphone smartphone) {
        this.name = name;
        this.age = age;
        this.smartphone = smartphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", smartphone=" + smartphone +
                '}';
    }
}
