package coding;

public class Demo {

    public static void main(String[] args) {
        String[] strs = new String[] {"Chabhi", "Chshek", "Chinu", "Cmicky", "Chisaloni"};
        Demo demo = new Demo();
        boolean isPresent = demo.checkIfPresent(strs, "Chinu");
        System.out.println(isPresent);
    }

    private boolean checkIfPresent(String[] strs, String toCheck) { // O(mn)
        int hashCode1 = hashCode(toCheck); // O(m)
        for (int i = 0; i < strs.length; i++) { // O(nm), O(1)
            int hashCode2 = hashCode(strs[i]); // O(m)
            if (hashCode1 == hashCode2) return true;

        }
        return false;
    }

    private boolean equals(String str1, String str2) { // O(n) where n is the length of shorter string.
        if (str1.length() != str2.length()) return false; // O(1), O(1)

        for (int i = 0; i < str1.length(); i++) { // O(n), O(1)
            if (str1.charAt(i) != str2.charAt(i)) return false; // O(1), O(1)
        }
        return true; // O(1)
    }

    /**
     * Calculating s[0].31^(n-1) + s[1].31^(n-2) + ... + s[n-1].31^0
     * @param str
     * @return
     */
    private int hashCode(String str) {// O(n), O(1)
        int hashCode = 0; // O(1), O(1)
        int length = str.length(); // O(1), O(1)

        for (int i = 0; i < length; i++) {// O(n), O(1)
            hashCode = hashCode*31 + str.charAt(i); // O(1)
        }
        return hashCode; // O(1), O(1)
    }

    /**
     * Calculates a^b.
     * 
     * Step 1: Multiply a b times.
     * @param a
     * @param b
     * @return
     */
    private int pow(int a, int b) {// O(b)
        int pow = 1;
        for (int i = 0; i < b; i++) {// O(b)
            pow = pow*b; // O(1)
        }
        return pow;
    }
}
