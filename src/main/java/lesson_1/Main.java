package lesson_1;

public class Main {
    public static void main(String[] args) {
        int[] ar = {0, 1, 2, 3, 4};

        for (int i = 0; i < ar.length; i++) {
            if (i == ar.length - 1)
                System.out.print(ar[i]);
            else
                System.out.print(ar[i] + ", ");
        }
        System.out.println();

        int e = 0;
        while (e < ar.length) {
            if (e == ar.length - 1)
                System.out.print(ar[e]);
            else
                System.out.print(ar[e] + ", ");
            e++;
        }
        System.out.println();

        int k = 0;
        do {
            if (k == ar.length - 1)
                System.out.print(ar[k]);
            else
                System.out.print(ar[k] + ", ");
            k++;
        } while (k < ar.length);
    }
}
