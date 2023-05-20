import java.util.Scanner;
public class SquareCalculator2 { // shouldn't this program be called RectangleCalc? as formula for square perimeter and area are different?
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // start your code from here
        // ask user to enter a height
        System.out.println("== RectangleCalculator Program==");
        System.out.println("Enter height: ");
        double height = reader.nextDouble(); // double is name of  datatype = contains whole number, variable name is height
        System.out.println("Enter the width: ");
        double width = reader.nextDouble(); // name of variable is width, contains value of 5
        // calculate perimeter
        double perimeter = 2 * (width + height); // Perimeter of a rectangle is P= 2(w * h)
        double area = (width * height); // Area of rectangle is A=w*h or A=w&l
        //Calculate area of rectangle not square as we're given width and height?
        // print the information

        System.out.println("Rectangle height = " + height);
        System.out.println("Rectangle width = " + width);
        System.out.println("Calculating......");
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);

    }
}
