import java.util.Scanner;
public class scrap1 {
    public static void main(String[] args) {
        System.out.println("Times Table Program:");
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter number to multiply: ");

        int num = reader.nextInt();

        for ( int i = 1; i<=12; i++ ){

            System.out.println(num + "x" + i +" = " +(i*num) );

        }
    }
}