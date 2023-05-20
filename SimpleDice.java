import java.util.Random;
public class SimpleDice {
    public static void main(String[] args) {

        Random random = new Random();
        int diceNumber = random.nextInt(12) +1;
        System.out.println("Dice has rolled number: ");

        System.out.println(diceNumber);

    }
}
