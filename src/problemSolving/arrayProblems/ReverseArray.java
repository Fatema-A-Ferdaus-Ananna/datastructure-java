package problemSolving.arrayProblems;

import array.Array;

public class ReverseArray {
    public static int[] reverse_array(int[] array, int start_index, int end_index){
        while (start_index < end_index){
            int temp = array[start_index];
            array[start_index] = array[end_index];
            array[end_index] = temp;
            start_index++;
            end_index--;
        }
        return array;
    }

    public static int[] reverseArray_unchangeMainArray(int[] array, int start_index, int end_index){
        int[] reversed_array = new int[array.length];
        while (start_index < end_index){
            reversed_array[start_index] = array[end_index];
            reversed_array[end_index] = array[start_index];
            start_index++;
            end_index--;
        }
        return reversed_array;
    }

    public static void main(String[] args){
        int[] arrayBeforeReverse1 = {3, 4, 2, 7, 9, 11, 13, 20, 6};
        int[] arrayBeforeReverse2 = {5, 20, 4, 60, 9, 11};
        Array array = new Array();
        array.show_array_value(arrayBeforeReverse1);
        array.show_array_value(arrayBeforeReverse2);

        System.out.println("\n\nAfter Reversing Array1:");
        int[] reversed_array1 =  reverse_array(arrayBeforeReverse1, 0, arrayBeforeReverse1.length-1);
        array.show_array_value(reversed_array1);
        //array.show_array_value(arrayBeforeReverse1);// it changed the main array


        System.out.println("\n\nAfter Reversing Array2 [without changing the main]:");
        int[] reversed_array2 =  reverseArray_unchangeMainArray(arrayBeforeReverse2, 0, arrayBeforeReverse2.length-1);
        array.show_array_value(reversed_array2);
        array.show_array_value(arrayBeforeReverse2);
    }
}
