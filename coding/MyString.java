package coding;

public class MyString {
    char[] value;
    int length;
    int hashCode = 0;

    public int length() { // O(1)
        return length; // O(1)
    }

    /**
     * Calcutating the hash and caching it.
     */
    @Override
    public int hashCode() {// O(n) where n is string's length if calculating first time, otherwise O(1)
        if (this.hashCode == 0) {// O(n)
            int h = 0; // O(1)
            for (int i = 0; i < length; i++) {// O(n)
                h = h*31 + value[i]; // O(1)
            }
            this.hashCode = h;// O(1)
        }

        return this.hashCode; // O(1)
    }
    
}
