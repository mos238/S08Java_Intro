import java.util.Scanner;
public class andStatement1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Comparing x-value and y-value");
        System.out.println("Enter x-value: ");
        int  x = reader.nextInt();
        System.out.println("Enter y-value:");
        int  y = reader.nextInt();

        System.out.println(x>y);//returns false
        System.out.println(x >10 && y>10); //returns true
        System.out.println(x + y);

    }
}

