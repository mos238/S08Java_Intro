// User input in java
// 1. import java S
import java.util.Scanner; // user input in java syntax
public class UserInput {
    public static void main(String[] args) {
        // 2. create object for the scanner
        Scanner reader = new Scanner(System.in); // part of import java syntax
        System.out.println("LOGIN PAGE");
        System.out.println("Enter username = "); // ask the user to enter a username
        String username = reader.nextLine(); // this part allows user to enter a username as a string
        System.out.println("Enter password = ");
        // 3. Create the field, and store user information to suitable variable
        int password = reader.nextInt(); // asks user for a numerical password only
        //String password = reader.next(); // allows user to type a number as the password NOT a string

        System.out.println("You have entered : " + username);
        System.out.println("You have entered : " + password);
        // your turn, ask user to enter the password, this password is combination of numbers (int)
        // store this information inside password variable, read the user input
        // print user password

    }
}
