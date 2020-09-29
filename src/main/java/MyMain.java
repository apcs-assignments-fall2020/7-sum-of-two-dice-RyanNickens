import java.util.Scanner;
import java.util.stream.*;
import java.util.Arrays;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
      int output = (int) (Math.random() * 6) + 1;
      return output;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
      int[] arr = new int[12];
      //int[] newArr = new int[12];

      for (int i = 0; i < n; i++) {
        int e = rollDie();
        int f = rollDie();
        int w = f + e;
        if (w == 2) {
          arr[0] = arr[0] + 1;
        }
        if (w == 3) {
          arr[1] = arr[1] + 1;
        }
        if (w == 4) {
          arr[2] = arr[2] + 1;
        }
        if (w == 5) {
          arr[3] = arr[3] + 1;
        }
        if (w == 6) {
          arr[4] = arr[4] + 1;
        }
        if (w == 6) {
          arr[5] = arr[5] + 1;
        }
        if (w == 7) {
          arr[6] = arr[6] + 1;
        }
        if (w == 8) {
          arr[7] = arr[7] + 1;
        }
        if (w == 9) {
          arr[8] = arr[8] + 1;
        }
        if (w == 10) {
          arr[9] = arr[9] + 1;
        }
        if (w == 11) {
          arr[10] = arr[10] + 1;
        }
        else {
          arr[11] = arr[11] + 1;
        }
        
      }
      //System.out.printArray(arr);
      return arr;
      
    }


    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      //System.out.println(rollDie());

      System.out.println("How many pair of dice would you like to roll?");
      int number = scan.nextInt();
      //System.out.println(sumOfTwoDice(number));
      System.out.println("amount of each sum rolled,read like an array");
      System.out.println(Arrays.toString(sumOfTwoDice(number)));
      //printed out as an array
      //unable to get it to print out on individual lines, so it fails one test. will revise

        // YOUR CODE HERE
    }
}