import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and

    // assign it to a variable of type Map
    Map<String, Integer> phoneBook = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    phoneBook.put("Gamma", 122);
    phoneBook.put("Beta", 143);
    phoneBook.put("Sylo", 176);

    System.out.println(phoneBook);
    System.out.println("------------------------------------------------");
    // Get the value associated with a given key in the Map
    System.out.println(phoneBook.get("Gamma"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println("------------------------------------------------");
    System.out.println(phoneBook.size());
    System.out.println("------------------------------------------------");
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    phoneBook.put("Jeff", 122);
    System.out.println(phoneBook.get("Jeff"));
    System.out.println("------------------------------------------------");
    System.out.println(phoneBook);
    // Check whether the Map contains a given key
    System.out.println("------------------------------------------------");
    System.out.println(phoneBook.containsKey("Alpha"));
    // Check whether the Map contains a given value
    System.out.println("------------------------------------------------");
    System.out.println(phoneBook.containsValue(122));
    // Iterate over the keys of the Map, printing each key
    System.out.println("------------------------------------------------");
    System.out.println(phoneBook.keySet());
    // Iterate over the values of the map, printing each value
    System.out.println("------------------------------------------------");
    System.out.println(phoneBook.values());
    // Iterate over the entries in the map, printing each key and value
    System.out.println("------------------------------------------------");


    for(Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
