public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negativeInt = -4;
    System.out.println(negativeInt);
    // Create an int with a positive value and assign it to a variable
    int positiveInt = 4;
    System.out.println(positiveInt);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    double negativeRemainder = negativeInt % 3;
    double positiveRemainder = positiveInt % 3;
    System.out.println(negativeRemainder);
    System.out.println(positiveRemainder);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)

    if(positiveInt % 2 == 0) {
      System.out.println(positiveInt + " has no remainder when divisible by 2");
    }

    if(negativeInt % 2 == 0) {
      System.out.println(negativeInt + " has no remainder when divisible by 2");
    }
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    int num = 10;

    if(num % 2 == 0) {
      System.out.println(num + " is an even number");
    }
    else {
      System.out.println(num + " is an odd number");
    }
    // Divide the number by another number using integer division
    double result = (double) num / 3;

    System.out.println(result);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
