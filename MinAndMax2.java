// 1. import random class
import java.util.Random;
public class MinAndMax2 {
    public static void main(String[] args) {
        // 2. create object random
        Random random = new Random();
        // 3. initialise empty array with size 10
        int[] array = new int[10]; // creating table with 10 columns, empty table
        // 4. generate random numbers to fill in your array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
        // 5. to find the biggest element, create new variable max, set as 0
        int max = array[0];
        // 6. a. use for loops to compare max and array[i]
        // 6.b. inside the loop update max if array[i] is bigger
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                // update max
                max = array[i];
            }
        }
        System.out.println("\nMax value is " + max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                // update max
                min = array[i];
            }
        }
            System.out.println("\nMin value is " + min);

                // 7. to find the lowest, crate new variable min, set as 0

                // 8. a. use for loop to compare min and array[i]
                // 8. b. inside the loop update min in array[i] is smaller

                // 9. print max value
                // 10. print min value

        }
    }
