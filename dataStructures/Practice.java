package dataStructures;

public class Practice {

    public static void main(String[] args) {
        LinkedList<String> strLinkedList = new LinkedList<String>();
        strLinkedList.add("Saloni");
        strLinkedList.add("is");
        strLinkedList.add("a");
        strLinkedList.add("good");
        strLinkedList.add("girl");

        String[] strArray = new String[5];
        strArray[0] = "Saloni";
        strArray[1] = "is";
        strArray[2] = "a";
        strArray[3] = "good";
        strArray[4] = "girl";

        // For loop  - array
        for (int i = 0; i < strArray.length; i++) {
            String element = strArray[i];
            System.out.println(element);
        }

        // Enhanced for loop - array
        for(String element: strArray) {
            System.out.println(element);
        }

        // For loop - Linked list
        for(int i = 0; i < strLinkedList.size(); i++) {
            String element = strLinkedList.get(i);
            System.out.println(element);
        }

        // Enhanced for loop - Linked list
        for(String element: strLinkedList) {
            System.out.println(element);
        }
    }
    
}
