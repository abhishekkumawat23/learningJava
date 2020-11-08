package dataStructures;

public class God {
    public static void main(String[] args) {
        // Inhertiance - Common properties and methods
        // Multi-inheritance allowed? No because single parent.
        // Par interface can be multiple.
        //
        // Polymorphism - Multiple forms
        // Expression - Parent variableName = new Child();
        //
        // Human saloni = new Human("Saloni", "fair");
        // saloni variable can access all methods/properties of Human, Mammal, Animal and Object.
        //
        // Mammal saloni = new Human("Saloni", "fair");
        // saloni variable can access all methods/properties of Mammal, Animal, and Object.
        // Human saloniH = (Human) saloni;
        // saloniH variable can access all methods/properties of Human, Mammal, Animal, Object.
        //
        // Animal saloni = new Human("Saloni", "fair");
        // Mammal saloniM = (Mammal) saloni;
        //
        // Object saloni = new Human("Saloni", "fair");
        //
        // Dog oreo = new Dog("Oreo", "brown");
        // Mammal oreo = new Dog("Oreo", "brown");
        // Animal oreo = new Dog("Oreo", "brown");
        // Object oreo = new Dog("Oreo", "brown");
    }
}
