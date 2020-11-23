package dataStructures;

public class Map<E, T> {
    E[] keys = (E[]) new Object[8];
    T[] values = (T[]) new Object[8];
    int size = 0;

    public void add(E key, T value) {
        keys[size] = key;
        values[size] = value;
        size++;
    }

    // Gets the value for the given key.
    public T get(E key) {
        // Finding the key index.
        int keyIndex = 0;
        for(int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                keyIndex = i;
                break;
            }
        }

        // Find the value for the key
        return values[keyIndex];
    }
}
