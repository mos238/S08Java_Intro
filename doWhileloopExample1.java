public class doWhileloopExample1 {
    public static void main(String[] args) {
        //do ..while: execute the code first then check the condition
        int x = 1;
        do {
            System.out.println( x + "I am exectuted");
            //update counter
            x ++; // x =1..2..3...until x =9
        } while (x<10);

    }
}
