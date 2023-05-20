import java.util.Scanner;
public class ExistInArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);// create scanner object
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,}; // immutable: only 1 datatype, cant use "1.9" as this is a String datatype
        System.out.println("Enter an integer value to search in array between 1 to 10: ");
        int guess = reader.nextInt(); // take user input as int

        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (guess == numbers[i]){
                isFound = true;
            }
        }

        if(isFound)
        {
        System.out.println("Value " + guess + " found in array. ");
        } else {
        System.out.println("Value " + guess + " was not found in array. ");
        }
    }
}



