package array_list;

import java.util.Arrays;
import java.util.List;

public class MyArrayList<T> {
    private T[] array;
    private int size;

    public MyArrayList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public void add(T value) {
        increaseSize();
        array[size] = value;
        size++;
    }

    public void add(T value, int index) {
        increaseSize();
        if (index >= size)
            add(value);
        else {
            T[] temp_array = (T[]) new Object[array.length];
            for (int i = 0; i < array.length - 1; i++) {
                if (i < index) {
                    temp_array[i] = array[i];
                } else {
                    temp_array[i + 1] = array[i];
                }
            }
            temp_array[index] = value;
            array = temp_array;
            size++;
        }
    }

    public void addAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        return array[index];
    }

    public void set(T value, int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        array[index] = value;
    }

    public T remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Invalid index: " + index);

        T removedElement = array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;

        return removedElement;

    }

    public T remove(T value) {
        int index = indexOf(value);
        if (index != -1) {
            return remove(index);
        }
        return null;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            if (i == size - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    private int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void increaseSize() {
        if (size == array.length) {
            int newSize = size * 2;
            array = Arrays.copyOf(array, newSize);
        }
    }
}
