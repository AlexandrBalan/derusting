import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> groceries = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    groceries.add("tomatoes");
    groceries.add("snacks");
    groceries.add("protein powder");
    // Print the element at index 1
    System.out.println(groceries.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    System.out.println(groceries.set(1, "best snacks"));
    System.out.println(groceries);
    // Insert a new element at index 0 (the length of the list will change)
    groceries.add(0, "oranges");
    System.out.println(groceries);
    // Check whether the list contains a certain string
    System.out.println(groceries.contains("oranges"));
    // Iterate over the list using a traditional for-loop.
    for(int i = 0; i < groceries.size(); i++) {
      System.out.println(groceries.get(i));
    }
    // Print each index and value on a separate line
    for(int i = 0; i < groceries.size(); i++ ) {
      System.out.println(groceries.get(i) + " is at index " + i);
    }
    // Sort the list using the Collections library
    Collections.sort(groceries);
    System.out.println(groceries);
    // Iterate over the list using a for-each loop
    System.out.println("-------------------------------------------------------------");
    for(String i : groceries) {
      System.out.println(i);
    }
    // Print each value on a second line

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}