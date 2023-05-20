import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //2. create scanner object
        // 3. Ask user to enter a name or sentence to reverse
        // 4. read user input char array
        System.out.println("Enter a name or sentence to reverse: ");
        char[] letters = reader.nextLine().toCharArray();
        System.out.println("\nThe reverse sentence is : ");


        for (int i = letters.length -1; i >= 0; i--) {
            System.out.print( letters[i] + " "  );


        }
    }
}
