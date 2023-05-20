import java.util.Scanner; // need this for 'user input' to work
public class CircleCalculator2 {
    public static void main(String[] args) {
        //write your codes here
        Scanner reader = new Scanner(System.in); // need this for import java.util.Scanner to work!
        System.out.println("==Circle Calculator Programme==");
        System.out.println("Enter the circle radius ");
        //declare a double variable  circle radius
        double circleRadius = reader.nextDouble(); // reader.nextdouble() asks user to ender  a radius

        // calc diameter of the circle
        double circleDiameter = 2 * circleRadius;
        // Calc circumference of the circle
        double circleCircumference = 2   * 3.14 * circleRadius;
        //calc area of the circle
        double circleArea = 3.14 * circleRadius * circleRadius;
        //print all info above

        System.out.println("Circle Radius = " + circleRadius);
        System.out.println("Circle Diameter = " + circleDiameter);
        System.out.println("Circle Circumference = " + circleCircumference );
        System.out.println("Circle area = " + circleArea);

    }
}
