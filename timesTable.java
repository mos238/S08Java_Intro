import java.util.Scanner;
public class timesTable {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // part of import java syntax
        System.out.println("Enter a number to display the times table: ");
        int num = reader.nextInt(); // asks user for a numerical password only
        //2. create object scanner
        //3. print " Enter a number to display the times table:
        //4. retain user input using .nextInt()
        //create for loop to print number 1 to 12

        for (int i =1; i <=12; i ++)
           System.out.println( num + "x"+ i+ "="+ (num*i));//concatenate then use formula

    }

}
