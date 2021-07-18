package dataStructures;

public class User {
    public static void main(String[] args) {
        Human h1 = new Human("Saloni", "White", 28);
        Human h2 = new Human("Saloni", "White", 25);
        Human h3 = h1;
        System.out.println("Is h1 equals h2: " + h1.equals(h2));
 
        // int[] is allowed.
        // Integer[] is allowed.
        // ArrayList<Integer> is allowed.
        // ArrayList<int> is not allowed.
        //
        // Array me primtive and reference dono use ho dsakte hai.
        // par arraylist me ya phir generics me primitive use nahi ho sakta hai.
        // 
        // Array me generic ka concept nahi hota.
        // Generic ka pata <> en brackets se lag jata hai.

        // Java -> primtive, reference type
        // Reference types are objects.
        // Primitive types are not objects.
        //
        // int a  = 5 me is not a object. Here a is primtive.
        // Integer a = 10 me a is reference type aka object.
        //
        // int -> Integer
        // Integer -> int
        //
        // Note: Very important. In generics, you can't use primitive type.
        // Reason: Because generics converts to object when compiled.
        // 
        // Note: Generics are compile time thing. It is not a runtime thing.
        Map<Integer, String> strMap = new Map<Integer, String>();
        strMap.add(5, "I am five");
        strMap.add(10, "I am ten");
        String value = strMap.get(10);
        System.out.println("Value is: " + value);
    }

    // O(m+n), O(m+n)
    public void bla(char[] a, char[] b) {
        char[] c = new char[a.length + b.length]; // O(1), O(m+n) where m ia a ki length, and n is b ki length

        for (int i = 0; i < c.length; i++) { // O(m+n), O(1)
            c[i] = i < a.length ? a[i] : b[i]; // O(1), O(1)
        }
    }

    // O(m+n), O(m+n)
    public void bla1(String a, String b) {
        String c = a + b;
    }

    // Array has m elements, and each string in the array has length of n.
    public String worse(String[] strArray) { // O(n*m^2, O(m*n)
        String result = ""; // O(1), O(1)
        for (int i = 0; i < strArray.length; i++) { // O(n*m^2), O(m*n)
            result = result + strArray[i]; // O(i*n + n), O(i*n + n)
        }
        return result;
    }

    public String betterButMoreLines(String[] strArray) { // O(m*n), O(m*n)
        char[] result = new char[strArray.length*strArray[0].length()]; // O(1), O(m*n)

        int k = 0; // O(1), O(1)
        // Loop to access each string of the array.
        for (int i = 0; i < strArray.length; i++) { // O(m*n), O(1)

            String str = strArray[i]; // O(1), O(1)

            // Loop to access each character of the string
            for (int j = 0; j < str.length(); j++) { // O(n), O(1)
                result[k++] = str.charAt(j); // O(1), O(1)
            }
        }

        return new String(result); // O(m*n), O(m*n)
    }

    public String best(String[] strArray) { // O(m*n), O(m*n)
        StringBuilder builder = new StringBuilder(); // O(1), O(1)
        for (int i = 0; i < strArray.length; i++) { // O(m*n), O(m*n)
            builder.append(strArray[i]); // O(n), O(n)
        }
        return builder.toString(); // O(m*n), O(m*n)
    }
}
