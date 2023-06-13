package lesson_3_exception;

public class Main {
    public static void main(String[] args) {
        try {
            Object i = Integer.valueOf(0);
            String s = (String) i;
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
}
