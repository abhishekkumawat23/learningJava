// public class Child extends Parent implements Interface1, Interface2
public class ArrayList<E> implements List<E> {
    // Properties
    // Constructor
    // Methods

    public static void main(String[] args) {
        // Parent varname = new Child();
        // ParentInterface varname = new Child();
        // ArrayList<String> list = new ArrayList<String>();
        // Object list1 = new ArrayList<String>();

        // [["Abhishek", " Kumawat"], ["Saloni", " Abhishek", " Kumawat"], ["Mehul", " Ganesh", " Kumawat"]]
        List<List<String>> list = new ArrayList<List<String>>();

        // Adding 1st entry in list.
        List<String> firstRow = new ArrayList<String>();
        firstRow.add("Abhishek");
        firstRow.add(" Kumawat");
        list.add(firstRow);

        // Adding 2nd entry in list.
        List<String> secondRow = new ArrayList<String>();
        secondRow.add("Saloni");
        secondRow.add(" Abhishek");
        secondRow.add(" Kumawat");
        list.add(secondRow);

        // Adding 3rd entry in list.
        List<String> thirdRow = new ArrayList<String>();
        thirdRow.add("Mehul");
        thirdRow.add(" Ganesh");
        thirdRow.add(" Kumawat");
        list.add(thirdRow);
    }

    @Override
    public void add(E val) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void bla() {

    }
}
