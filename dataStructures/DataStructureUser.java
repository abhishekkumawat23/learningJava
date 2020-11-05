package dataStructures;

public class DataStructureUser {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        addValues(arrayList);
        getValues(arrayList);
        updateValues(arrayList);
        removeValues(arrayList);
    }

    public static void addValues(ArrayList arrayList) {
        int size = arrayList.getSize();
        System.out.println("size is " + Integer.toString(size));

        // Adding first element.
        arrayList.add(5);
        size = arrayList.getSize();
        System.out.println("size is " + Integer.toString(size));

        // Adding second element.
        arrayList.add(10);
        size = arrayList.getSize();
        System.out.println("size is " + Integer.toString(size));

        // Adding multiple elements.
        int[] input = new int[] {15, 20, 25, 28, 30, 35};
        arrayList.addAll(input);
        size = arrayList.getSize();
        System.out.println("size is " + Integer.toString(size));
    }

    public static void getValues(ArrayList arrayList) {
        int value1 = arrayList.get(0);
        int value2 = arrayList.get(5);

        System.out.println("Value is: " + value1);
        System.out.println("Value is: " + value2);

        // TODO: how to get all the elements?
        // We want a way that user gets all the values, but can't update it.
    }

    public static void updateValues(ArrayList arrayList) {
        // 0th index pe 6 value set kar do.
        arrayList.set(0, 6);
        arrayList.set(5, 29);

        System.out.println("Value is: " + arrayList.get(0));
        System.out.println("Value is: " + arrayList.get(5));
    }

    public static void removeValues(ArrayList arrayList) {
        int removedValue = arrayList.removeLast();
    }
    
}