package lesson_6;

public class Main {

    public static void main(String[] args) {
        try {
            exceptions();
        } catch (Exception e) {
            System.out.println("Caught exception in catch block: " + e.getMessage());
        }
    }

    public static void exceptions() throws Exception {
        try {
            throw new Exception("Exception in try block");
        } catch (Exception e) {
            throw new Exception("Exception in catch block");
        } finally {
            throw new Exception("Exception in try-catch with resources block");
        }
    }
}