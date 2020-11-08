package dataStructures;

public class ArrayList {
    // {"Saloni28", "Abhishek2"}
    private int[] array = new int[8]; // inner array ki length.
    private int size = 0; // arrayList ki size.

    public int getSize() {
        return size;
    }

    public void add(int value) { // amortized O(1), O(1)
        // Note: Since if is getting called only on powers of 2,
        // from the GP infinite formuls, it comes out to be amortized O(1).
        if (size == array.length) { // O(1), O(1)
            increaseSize(); // O(n), O(n)
        }

        array[size++] = value; // O(1), O(1)
    }

    private void increaseSize() { // O(n), O(n)
        // TODO: Why double, why not triple, or increse by 10?
        // Note: Doubling the size.
        int[] newArray = new int[2*this.array.length]; // O(1), O(n) where n is the current length of the array.

        // Copying the data from old array to new array.
        for(int i = 0; i < this.array.length; i++) { // O(n), O(1)
            newArray[i] = this.array[i]; // O(1), O(1)
        }

        // Pointing array to newArray.
        this.array = newArray; // O(1), O(1)
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
    
    public int[] getAll() {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

    /** Set the new value at the given index. */
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index should be in [0, size)");
        }

        array[index] = value;
    }

    /**
     * Remove the last element from the list.
     * 
     * @return Removed element.
     */
    public int removeLast() {
        if (size == 0) {
            throw new IllegalStateException("ArrayList is already empty");
        }

        // Decrease size.
        if (size == array.length / 2) {
            decreaseSize();
        }

        // Remove
        return array[--size];
    }

    /** Decrease the size by 2. */
    private void decreaseSize() {
        int[] newArray = new int[array.length/2];

        // Copy data.
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        // Point to new array.
        array = newArray;
    }
}
