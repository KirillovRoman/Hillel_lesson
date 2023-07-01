package array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        System.out.println(list.isEmpty());

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.print();

        list.add("100", 1);
        list.print();

        ArrayList<String> strings = new ArrayList<>();
        strings.add("101");
        strings.add("102");
        strings.add("103");

        list.addAll(strings);
        list.print();

        System.out.println(list.get(0));

        list.set("-1", 0);
        list.print();

        System.out.println(list.remove(1));
        list.print();

        list.remove("-1");
        list.print();

        System.out.println(list.isEmpty());
    }
}
