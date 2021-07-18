package coding;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    LinkedList<Entry<K, V>>[] values = new LinkedList<Entry<K, V>>[8];
    int size = 0;

    /**
     * Adds the key, value pair in the hashMap.
     * 
     * Steps:
     * 1. if values.length == size, then double the size of array.
     * 2. find the hashcode of key.
     * 3. find the index from the hashcode.
     * 4. If the value at index is null, create a empty linked list.
     * 5. Create the entry object.
     * 6. Add the entry object to the linked list present at index.
     * 7. increse the size to size+1
     * @param key
     * @param value
     */
    public void add(K key, V value) { // amortized O(1), amortized O(1) where n is size of hashMap. Ignoring m is it's very small in compare to n, so it's constant.
        if (values.length == size) { // O(n), O(n)
            increaseLength(); // O(n), O(n)
        }
        int hashCode = key.hashCode(); // O(m), O(1) where m doesn't depend on n. It depends on key.
        int index = hashCode % size; // O(1), O(1)
        if (values[index] == null) { // O(1), O(1)
            values[index] = new LinkedList<Entry<K, V>>(); // O(1), O(1)
        }
        Entry<K, V> entry = new Entry<K, V>(key, value, hashCode); // O(1), O(1)
        values[index].add(entry); // O(1), O(1)
        size++; // O(1), O(1)
    }

    /**
     * Removes the key, value pair from hashMap for the given key.
     * 
     * Steps:
     * 1. Find the key's hashCode.
     * 2. Find the index using hashCode.
     * 3. Find the linkedlist present at the index.
     * 4. If the linkedlist is null, then throw exception.
     * 5. If not null, then remove the entry from the linkedlist.
     * 6. If the removed element is null, throw exception.
     * 8. size--;
     * 9. If size = values.length/2, then decrese the array size.
     * 10. return the removed element.
     * @param key
     */
    public V remove(K key) {
        int hashCode = key.hashCode(); // O(m), O(1)
        int index = hashCode % values.length; // O(1), O(1)
        if (values[index] == null) throw new IllegalStateException("No element found to remove"); // O(1), O(1)
        Entry<K, V> removedEntry = removeEntry(values[index], key);
        if (removedEntry == null) throw new IllegalStateException("No element found to remove."); // O(1), O(1)
        size--;
        if (size == values.length / 2) {
            decreaseSize();
        }
        return removedEntry.value;
    }

    /**
     * Removes the entry from the linkedlist.
     * 
     * O(1), O(1) assuming we have very less collisions.
     * Less collisions are insured by following:
     * a. Incremeting the length of array ensures that index collision happens rarely.
     * b. By having unique hashcode Example: using prime number, index position in finding hashcode of string.
     * 
     * Steps:
     * 1. Start a for each loop for the linkedlist.
     * 2. Check that entry.key of each loop matches the key or not.
     * 3. If matches, then remove the entry from the linkedlist and return it.
     * 4. At the end of loop, return null.
     * @param linkedList
     * @param key
     * @return
     */
    private Entry<K, V> removeEntry(LinkedList<Entry<K, V>> linkedList, K key) {
        // O(n), O(1) because max possible value of l is n when all the elements of hashMap are in a single linkedlist. 
        // i.e. when all keys has same index i.e. index collision happens for all the elments. 
        // This happens when you are not able to avoid index collision properly.
        // When index collision doesn't happen, then each linkedlist will have at max one element, and thus time complexity will be O(1), O(1)
        for(Entry<K, V> entry: linkedList) { // O(l), O(1)
            if(entry.key.equals(key)) { // O(l), O(1)
                linkedList.remove(entry); // O(l), O(1)
                return entry;
            }
        }
        return null;
    }

    /**
     * Halfs the size of array and copies element from new to old array.
     * 
     * Steps:
     * 1. Create a new array of half size.
     * 2. Start a loop from 0 to old array's length.
     * 3. For each loop index, check if the linked list there is null or not.
     * 4. If not null, then start a for loop in that linked list to get each element one by one.
     * 5. For each element in the linked list, find the new index.
     * 6. At the new index, if the linked list is null, then create a new empty linked list.
     * 7. At the new index, add the entry object at the last of linked list.
     */
    private void decreaseSize() {
        int newLength = values.length / 2;
        LinkedList<Entry<K, V>>[] newValues = new LinkedList<Entry<K, V>>[newLength];
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) continue;
            for(Entry<K, V> entry: values[i]) {
                int newIndex = entry.hashCode % newLength;
                if (newValues[newIndex] == null) {
                    newValues[newIndex] = new LinkedList<Entry<K, V>>();
                }
                newValues[newIndex].add(entry);
            }
        }
    }

    /**
     * Doubles the array size and copies value from old to new.
     * 
     * Steps:
     * 1. Create a new array of double size.
     * 2. Start a for loop from 0 to old array's length.
     * 3. For each element at the loop index, check if value is null.
     * 4. If not null, then start a loop in the linkedlist present at that index.
     * 5. For each element in the linked list, find it's new index.
     * 6. Then at the new index, create a linekd list if the value is null.
     * 7. At the new index, add the entry object at the end of linked list. 
     */
    private void increaseLength() { // O(n). O(n)
        int newLength = values.length*2; // O(1), O(1)
        LinkedList<Entry<K, V>>[] newValues = new LinkedList<Entry<K, V>>[newLength]; // O(1), O(n) where n is size of hashMap.
        for (int i = 0; i < values.length; i++) { // O(n), O(n)
            if(values[i] == null) continue; // O(1), O(1)
            for(Entry<K, V> entry: values[i]) { // unknown - loop kitni bar chala??
                int newIndex = entry.hashCode % newLength; // O(1), O(1)
                if (newValues[newIndex] == null) { // O(1), O(1)
                    newValues[newIndex] = new LinkedList<Entry<K, V>>(); // O(1), O(1)
                }
                newValues[newIndex].add(entry); // O(1), O(1)
            }
        }

    }

    

    class Entry<K, V> {
        K key;
        V value;
        int hashCode;

        Entry(K key, V value, int hashCode) {
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
        }
    }
    
}
