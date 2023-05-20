import java.util.Scanner;
public class ifStatement2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("DO YOU PASS YOUR DRIVING TEST?");
        System.out.println("Enter your MCQ score");
        int score = reader.nextInt();

        // if statement
        if (score >= 43 && score<=50) { // AND statement, both conditions must be true to execute the body of this if
            // body of the if statement, print this if the condition is true
            System.out.println("Congratulation, you pass the test!");
        } else if (score <0 || score > 50 ) {
            System.out.println("You entered a wrong score.");
        } else {
            System.out.println("Sorry, you failed the test.");
        }

        System.out.println("Enter your Hazard Perception Test score");
        int hScore = reader.nextInt();

        // if statement
        if (hScore >= 44 && hScore <= 75) {
            // body of the if statement, print this if the condition is true
            System.out.println("Congratulation, you pass the test!");
        } else if (hScore < 0 || hScore > 75) {
            System.out.println("You entered a wrong score.");
        } else {
            System.out.println("Sorry, you failed the test.");
        }

    }
}