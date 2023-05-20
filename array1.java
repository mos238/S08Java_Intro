public class array1 { // Array: Collection of same datatype datas
    public static void main(String[] args) {

        String [] names = {"Harry", "Ron", "Draco", "Hermione"};

        System.out.println(names.length); // display the length of array
        //System.out.println(names[0]); // display Harry
        //System.out.println(names[1]);
        //System.out.println(names[2]);
        //System.out.println(names[3]);
        // use for loop to display all the datat inside array
        for (int i=0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }

}

