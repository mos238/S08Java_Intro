import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {

        Random random = new Random(); // create random object

        int[] array1 = new int[10];//initialise empty array1 with size 10

        for (int i = 0; i < array1.length; i++) { // first for loop to access elements in array1
            array1[i] = random.nextInt(20) + 1;
            System.out.print(array1[i] + " ");//print array1 using for loop
        }
        System.out.println();//empty line

        int[] array2 = new int[10];//initialise empty array2 with size 10

        for (int j = 0; j < array2.length; j++) { //  second for loop to access elements in array2
            array2[j] = random.nextInt(20) + 1;//generate random numbers to fill in your array2
            System.out.print(array2[j] + " ");// print array2 using for loop
        }
        System.out.println();
        System.out.println("These are the duplicate numbers from array1 that are found in array2");
        for (int i = 0; i < array1.length; i++) {// nested for loop
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);

                }
            }
        }
    }
}
