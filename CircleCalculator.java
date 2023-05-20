public class CircleCalculator {
    public static void main(String[] args) {

        // write your codes here
        // declare a double variable to store the circle radius

        double circleRadius = 12;
        // calculate diameter of the circle
        double circleDiameter = 2 * circleRadius;
        // calculate circumference of the circle
        double circleCircumference = 2 * 3.14 * circleRadius;
        // calculate area of the circle
        double circleArea = 3.14 * circleRadius * circleRadius;
        System.out.println("Circle Calculator Programme");
        System.out.println("Circle Radius = " + circleRadius);
        System.out.println("Circle diameter =" + circleDiameter);
        System.out.println("Circumference = " + circleCircumference);
        System.out.println("Circle area = " + circleArea);


    }
}