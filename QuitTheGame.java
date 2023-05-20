import java.util.Scanner;
public class QuitTheGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter y or Y to quit the game!");
        String response = reader.next();

        if (! response.equals("y") && ! response.equals("Y")) {
            System.out.println("You quit the game.");
        } else {
            System.out.println("you quit the game. ");
        }
    }
}
