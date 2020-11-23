package dataStructures;

// Note: We solved the problem of having a specific type of arraylist by using generic.
// which is a compile time concept.
public class ArrayList<E> {
    // Length of array and size of arrayList are different things.
    // In starting length of array is 8, and size is 0.
    // Length of array always increase in power of 2.
    // But size increases one by one.
    private E[] array = (E[]) new Object[8];
    private int size = 0;

    // Constructor method
    public ArrayList() {

    }

    // Note: Revise the amprtized time complexicity concept.
    public void add(E value) {
        // This means internal array is full, so we need to increase its size.
        if (size == array.length) {
            increaseSize();
        }
        
        array[size++] = value;
    }

    private void increaseSize() {
        // Create the new array of double size.
        E[] newArray = (E[]) new Object[array.length*2];

        // Copy data from old array to new array.
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // Assing the array variable to new array.
        array = newArray;
    }

    public E remove(int index) {
        E toBeRemoved = array[index];
        for (int i = index + 1; i < size; i++) {
            array[i-1] = array[i];
        }
        size--;
        return toBeRemoved;
    }

    public E removeLast(){
        // Last element is size-1.
        return array[--size];
    }

    public E get(int index) {
        return array[index];
    }
    
}
