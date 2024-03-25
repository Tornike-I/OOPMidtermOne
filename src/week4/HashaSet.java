package week4;

import java.util.HashSet;
import java.util.Set;
public class HashaSet {
    public static void main(String[] args) {
        // Creating a HashSet to store String elements
        Set<String> fruits = new HashSet<>();
        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        // Attempting to add a duplicate element
        boolean isAdded = fruits.add("Apple"); // Returns false
        System.out.println("Was 'Apple' added again? " + isAdded);
        // Checking if an element exists
        boolean containsOrange = fruits.contains("Orange");
        System.out.println("Does the set contain 'Orange'? " + containsOrange);
        // Removing an element
        fruits.remove("Banana");
        System.out.println("HashSet after removal: " + fruits);
        // Iterating over elements
        System.out.println("Iterating over elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}