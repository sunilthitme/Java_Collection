package src.list;

import java.util.Vector;

//Synchronised
//slow insertion, deletion and searching order
public class Vector_java {
    public static void main(String[]args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // Accessing elements
        System.out.println("Elements in the Vector: " + vector);

        // Removing an element
        vector.remove("Python");

        // Accessing elements after removal
        System.out.println("Elements after removal: " + vector);
    }
}

