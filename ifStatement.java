import java.util.Scanner;
public class ifStatement {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("DID YOU PASS YOUR HAZARD TEST");
        System.out.println("Enter your Hazard perception score: ");
        int score = reader.nextInt();

        //if statement
        if (score >= 44 && score <=75) { // AND statement , both conditions must be true
            // body of the if statement, print this if the condition is true
            System.out.println("Congrats, you've passed!");
        } else if (score < 0 || score > 75) {

            System.out.println(" You entered a wrong score");

        } else {
            System.out.println("I'm sorry you failed, better luck next time!");
        }

    }




}
