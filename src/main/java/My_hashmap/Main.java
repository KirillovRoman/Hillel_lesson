package My_hashmap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(0, "zero");
        myHashMap.put(1, "one");
        System.out.println(myHashMap.get(0));
        System.out.println(myHashMap.get(1));
    }
}
