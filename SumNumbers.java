import java.util.Scanner; // 1. import scanner
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // 2. create scanner object
        //3. ask user to enter a number to sum
        System.out.println("Enter a number to sum: ");//Gauss worked added up all the numbers from 1 to 100 to get 5050
        //4. retain user input as a variable called answer
        int answer = reader.nextInt();
        //5. use while loop to display 1 to answer

        int i = 1; //while counter initialisation
        int sumNumber = 0;// create a variable called sumNumber to store result
        while (i <=answer) {
            System.out.println(i + " ");
            sumNumber = sumNumber + i;
            i++;
        }
            System.out.println("\nSum of numbers = " + sumNumber);


    }
}
