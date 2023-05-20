import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // start your code from here
        System.out.println("== SQUARE CALCULATOR PROGRAM==");
        System.out.println("Enter height: ");
        double height = reader.nextDouble(); // double is name of  datatype = contains whole number, variable name is height
        System.out.println("Enter the width: ");
        double width = reader.nextDouble(); // name of variable is width,
        // calculate perimeter
        double perimeter = 2 * (width + height);
        //Calculate area of rectangle

        double area = (width * height); // Area of rectangle is A=w*h or A=w&l
        // print the information

        System.out.println(" height = " + height);
        System.out.println(" width = " + width);
        System.out.println(" Calculating......");
        System.out.println(" Perimeter is " + perimeter);
        System.out.println(" Area is " + area);
    }
}
