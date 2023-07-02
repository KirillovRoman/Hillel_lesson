package lesson_6;

public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        try (DoSomething doSomething = new DoSomething()) {
            throw new Exception("Exception in try block");
        } catch (Exception e) {
            throw new RuntimeException("Exception in catch block");
        }
    }
}