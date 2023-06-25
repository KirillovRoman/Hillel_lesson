package lesson_6;
public class Main {
    public static void main(String[]args){
        try{
            throw new MyCheckedException("This is a checked exception");
        }catch(MyCheckedException e){
            System.out.println("Caught MyCheckedException: "+e.getMessage());
        }
    }
}

