package problemSolving.arrayProblems;

import array.Array;

public class MinimumValueInArray {
    public static int find_minimum_of_array(int[] array){
        int minimum = array[0];
        for (int i = 1; i<array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }


    public static void main(String[] args){
        int[] array1 = {3, 4, 2, 7, 9, 11, 13, 20, 6};

        Array array = new Array();
        array.show_array_value(array1);

        int result =  find_minimum_of_array(array1);
        System.out.println("\n\nMinimum Value of The Array :" + result);
    }
}
