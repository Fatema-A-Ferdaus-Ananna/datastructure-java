package problemSolving.arrayProblems;

public class RemoveEvenInteger {
    public void show_array_value(int[] int_array1){
        System.out.print("Array :  ");
        for(int index=0; index < int_array1.length; index++){
            System.out.print(int_array1[index] + " \t");
        }
    }

    public int[] remove_even(int[] array){
        int oddCount = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2 != 0){
                oddCount++;
            }
        }

        int[] oddIntegerArray = new int[oddCount];
        int inx = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2 != 0){
               oddIntegerArray[inx] = array[i];
               inx++;
            }
        }
        return oddIntegerArray;
    }


    public static void main(String[] args){
        RemoveEvenInteger removeEvenInteger = new RemoveEvenInteger();
        int[] array_even_odd = {3, 4, 2, 7, 9, 11, 13, 20, 6}; // 3,7,9,11,13
        removeEvenInteger.show_array_value(array_even_odd); //original
        int[] result = removeEvenInteger.remove_even(array_even_odd);
        System.out.println("\n\nAfter Removing Even Number: ");
        removeEvenInteger.show_array_value(result);
    }
}
