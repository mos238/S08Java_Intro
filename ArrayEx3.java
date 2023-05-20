import java.util.Scanner;
// Java program that asks user to input integers into an array.
public class ArrayEx3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Ask user to specify size of  array.
        System.out.println("Enter the size of the array: ");
        int array_size = 0;
        if (sc.hasNextInt()) {
            array_size = sc.nextInt();
        }
        // Initialize the array's size using user input
        int[] arr = new int[array_size];

        // Take user elements for the array
        System.out.println(
                 "Enter " +  array_size + " integers to make the array: ");
        for (int i = 0; i < array_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println(
                "The integers you entered in the array are: ");
        for (int i = 0; i < array_size; i++) {
            // prints the elements of an array
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}





