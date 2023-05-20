import java.util.Scanner;
public class ArrayEx3_odd
{
    public static void main(String[] args) {
        // Ask/Take input from the user using Scanner object
        Scanner input = new Scanner(System.in); // creates a new Scanner 'instance', here 'input' is the variable you've assigned you could have called it 'num' etc
        System.out.println("Program to output all odd numbers from array ");
        System.out.print("\nEnter the size of array: ");

        int arraySize = input.nextInt(); //Declare size of array
        int array[] = new int[arraySize];//Declare an array

        for(int i=0; i<arraySize; i++) {
            System.out.print("Enter integer value for index " + i + " :");
            array[i] = input.nextInt();//Initialise array elements
        }
        System.out.println("The odd numbers in the array are: ");
        for(int i=0; i<arraySize; i++)
        {
            if(array[i]%2!=0){ // replace to %2==0 to display even numbers
                System.out.print(array[i] +"\n");

            }
        }
    }
}