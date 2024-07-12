package array;

import java.util.ArrayList;

public class ArrayListBasic {

    public void creating_arraylist(){
        ArrayList<Integer> int_list = new ArrayList<Integer>(); //primitive type not allow e.g: int, float, double
                                        //wrapper class: Integer, Boolean,Character,Double
        int_list.add(3);
        int_list.add(10);
        int_list.add(9);
        int_list.add(12);
        int_list.add(2);

        show_arraylist(int_list);

        int_list.add(3,100);
        show_arraylist(int_list);

        int_list.set(4, 300);
        show_arraylist(int_list);

        int_list.remove(5);
        show_arraylist(int_list);

        int_list.clear();
        show_arraylist(int_list);
    }

    public void show_arraylist(ArrayList<Integer> int_list){

        System.out.print("Elements : ");
        System.out.print( int_list +" \n" ); //Printing the arraylist object
        System.out.print("Elements : ");
        for (int int_value: int_list){
            System.out.print( int_value +" " ); //Traversing list through for-each loop
        }
        int arraylist_size = int_list.size();
        System.out.print("\nArraylist Size: " + arraylist_size);

        System.out.println("\nElement of index 0 is: "+ int_list.get(0));
        System.out.println("Element of index 4 is: "+ int_list.get(4));
        System.out.println("\n");
    }


    public static void main(String[] args) {
        ArrayListBasic al = new ArrayListBasic();
        al.creating_arraylist();
    }
}

