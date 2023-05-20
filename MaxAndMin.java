import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10]; // bound is 1 to 10

        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(10)+1;
            System.out.print(array[i] + " ");
        }
        int max =array[0];
        for(int i=0; i<array.length; i++){
            if ( array[i] > max){
                //update max
                max = array[i];
            }
        }
        System.out.println("\nMax value in array is: " + max);

        int min = array[0];
        for(int i=0; i<array.length; i++){
            if (array[i]< min){
                //update min
                min = array[i];
            }
        }
        System.out.println("\nMin value in array is:" + min);

    }
}
