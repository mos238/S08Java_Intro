public class andOrNotStatement {
    public static void main (String[]args)
    {
        int a = 7;
        int b = 5;
        System.out.println (a < 10 && b >=5);  //returns true
        System.out.println (a < 10 || b < 10);  //returns true
        System.out.println (!(a < 10 && b < 15)); //returns false
    }



}
