package problemSolving.arrayProblems;

import array.Array;

public class SecondMaxInArray {
    public int second_max_in_array(int[] arr){
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length; i++ ){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args){
        int[] array1 = {26, 4, 2, 11, 9, 11, 13, 20, 26};

        Array array = new Array();
        array.show_array_value(array1);

        SecondMaxInArray sma = new SecondMaxInArray();
        int result = sma.second_max_in_array(array1);
        System.out.println("\nSecond Max Value of The Array: " + result);
    }
}
