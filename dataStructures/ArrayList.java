package dataStructures;

public class ArrayList {
    private int[] array = new int[8]; // inner array ki length.
    private int size = 0; // arrayList ki size.

    public int getSize() {
        return size;
    }

    // O(1)
    public void add(int value) {
        if (size >= array.length) {
            increaseSize();
        }

        array[size++] = value;
    }

    public void increaseSize() {
        // TODO: how to increase size.
    }

    // O(n) where n is the length of 'values' input.
    public void addAll(int[] values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    // O(1)
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index should be in [0, size)");
        }

        return array[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index should be in [0, size)");
        }

        array[index] = value;
    }

    public int removeLast() {
        if (size == 0) {
            throw new IllegalStateException("ArrayList is already empty");
        }
        return array[--size];
    }
}
