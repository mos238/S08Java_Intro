import java.util.Scanner;
public class ThreeDigitCodes {//nested loop: a loop inside another loop
    public static void main(String[] args) {
        //create variable to count loop
        int counter =0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j!=k)
                    {
                        System.out.println(i + " " + j + " " + k );
                        counter = counter + 1; //add 1 to counter each time we have a loop
                    }
                }
            }
        }
        System.out.println("How many unique numbers? " + counter);
    }
}