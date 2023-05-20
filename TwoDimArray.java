public class TwoDimArray {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3}, {4,5,6}};
        //accessing array element
        //System.out.println(numbers[0][0]); //output 1 //long method
        //System.out.println(numbers[0][1]);
        //System.out.println(numbers[0][2]);
        //System.out.println(numbers[1][0]);
        //System.out.println(numbers[1][1]);
        //System.out.println(numbers[1][2]);

        //access all elements using nexted for loops
        System.out.println("Access all elements using nested for loops");
        for(int i=0; i<numbers.length; i++){//accessing rows
            for(int j=0; j<numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }

        }
    }
}
