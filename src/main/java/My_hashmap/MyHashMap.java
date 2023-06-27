package My_hashmap;
import java.util.Arrays;

public class MyHashMap<K, V>{
    private K[] keys;
    private V[] values;
    private int size;

    public MyHashMap() {
        keys = (K[]) new Object[10];
        values = (V[]) new Object[10];
        size = 0;
    }

    public void put(K key, V value) {
        int index = indexOf(key);

        if (index != -1) {
            values[index] = value;
        } else {
            ensureCapacity();
            keys[size] = key;
            values[size] = value;
            size++;
        }
    }

    public V get(K key) {
        int index = indexOf(key);

        if (index != -1) {
            return values[index];
        }

        return null;
    }

    public int getSize(){
        return size;
    }

    private int indexOf(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }

        return -1;
    }

    private void ensureCapacity() {
        if (size == keys.length) {
            int newCapacity = size * 2;
            keys = Arrays.copyOf(keys, newCapacity);
            values = Arrays.copyOf(values, newCapacity);
        }
    }
}
