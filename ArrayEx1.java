public class ArrayEx1 {
    public static void main(String[] args) {

        int[] carPrices = {12000, 34000, 56000, 15450, 45000}; // immutable: only 1 datatype, cant use "1.9" as this is a String datatype
        // Print all the array elements

        for (int i = 0; i < carPrices.length; i++) {
            System.out.println(carPrices[i] + " ");
        }
        // update the first value
        System.out.println("Updated prices: ");
        carPrices[0] =12670;
        for (int i = 0; i < carPrices.length; i++) {
            System.out.println(carPrices[i] + " ");
        }

    }
}

