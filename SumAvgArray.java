public class SumAvgArray {
    public static void main(String[] args) {

        // create an array of integers,
        // put 10 random numbers inside it
        //display
        int sum = 0;
        int[] numbers = {15, 34, 23, 11, 14, 45, 26, 56, 67,34,}; // immutable: only 1 datatype, cant use "1.9" as this is a String datatype
        // Print all the array elements


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
            sum = sum + numbers[i];// or use shorthand sum += numbers[i];

        }
            System.out.println("Total = " + sum);
            double average = (double) sum / numbers.length;
            System.out.println("Average = "  + average );
    }



}

