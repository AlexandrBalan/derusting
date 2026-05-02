import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String character = "batman";
    System.out.println(character);
        System.out.println("------------------------------------------------");
    // Find the length of the string
    System.out.println(character.length());
        System.out.println("------------------------------------------------");
    // Concatenate (add) two strings together and reassign the result
    String prefix = "Mr.";

    String person = prefix + character;

    System.out.println(person);
    System.out.println("------------------------------------------------");
    // Find the value of the character at index 3
    System.out.println(person.charAt(3));
    System.out.println("------------------------------------------------");
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if(person.contains("bat")) {
      System.out.println("True");
    }
    else {
      System.out.println("False");
    }
    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < person.length(); i++) {
      System.out.println(person.charAt(i));
    }
    System.out.println("------------------------------------------------");
    // Create an ArrayList of Strings and assign it to a variable
    List<String> dictionary = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    dictionary.add("I want");
    dictionary.add("to go to bed");
    dictionary.add("because i am tired");
    dictionary.add("of coding");

    System.out.println(dictionary);
    System.out.println("------------------------------------------------");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(", ", dictionary);
    System.out.println(joined);
    // Check whether two strings are equal
    String one = "how're you doing";
    String two = "how are you doing";

    System.out.println("------------------------------------------------");
    if(one.equals(two)) {
      System.out.println("Equal!");
    }
    else {
      System.out.println("Not equal :(");
    }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
