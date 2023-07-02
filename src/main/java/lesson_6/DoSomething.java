package lesson_6;

public class DoSomething implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new RuntimeException("Exception in try with resources");
    }
}
