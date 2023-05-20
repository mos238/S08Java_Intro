public class doWhileLoop {
    public static void main(String[] args) {
        //do ..while: execute the code first then check the condition
        int x = 0;
        do {
            System.out.println( "value of x:" +x);
            //update counter
            x ++; // x =1..2..3...until x =19
            System.out.println("\n");
        } while (x<10);
    }
}
