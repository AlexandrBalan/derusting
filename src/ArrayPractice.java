import java.util.Arrays;

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String array[] = new String[4];

    System.out.println(Arrays.toString(array));
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    System.out.println("------------------------------------------------");
    for(int i = 0; i < array.length; i++) {
      array[i] = "one" + 1;
    }
    System.out.println(Arrays.toString(array));
    // Get the value of the array at index 2
        System.out.println("------------------------------------------------");
    System.out.println(array[2]);

    System.out.println("------------------------------------------------");
    // Get the length of the array
    System.out.println(array.length);
        System.out.println("------------------------------------------------");
    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    System.out.println("------------------------------------------------");
    // Iterate over the array using a for-each loop and print out each item
    for(String i : array) {
      System.out.println(i);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
