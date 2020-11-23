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
    
}
