package lesson_4;

import java.util.Arrays;

public class Main {
    private int global_1;
    private char global_2;
    private String[] global_3 = new String[10];

    public int getGlobal_1() {
        return global_1;
    }

    public char getGlobal_2() {
        return global_2;
    }

    @Override
    public String toString() {
        return "Main{" +
                "global_3=" + Arrays.toString(global_3) +
                '}';
    }

    public static void main(String[] args) {

        int local_1 = 0;
        char local_2 = 'a';
        String[] local_3 = new String[10];

        Main main = new Main();
        System.out.println(main.getGlobal_1() + " - global int");
        System.out.println(main.getGlobal_2() + " - global char");
        System.out.println(main.toString());

        System.out.println(local_1 + " - local int");
        System.out.println(local_2 + " - local char");
        for (int i = 0; i < local_3.length; i++) {
            if (i == local_3.length - 1)
                System.out.print(local_3[i]);
            else
                System.out.print(local_3[i] + ", ");
        }
    }
}
