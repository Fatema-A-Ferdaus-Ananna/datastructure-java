package array;

import java.util.Scanner;

public class Array2D {

    public String array_2d[][] = new String[3][3] ;

    public void array_input(){


        for(int row = 0; row < array_2d.length; row++){

            for (int column= 0; column < array_2d[0].length ; column++ ) {
                System.out.print("Enter a String For ["+ row +","+ column + "]  :");
                Scanner instance_scanner_input = new Scanner(System.in);
                array_2d[row][column] = instance_scanner_input.nextLine();
            }
        }

        System.out.print("Column 1 \t\t\t\t" + "Column 2 \t\t\t\t" + "Column 3");
        for(int row = 0; row < array_2d.length; row++){
            System.out.println();
            for (int column = 0; column< array_2d[0].length; column++ ) {
                System.out.print(array_2d[row][column] + "\t\t\t\t\t");
            }
        }
    }


    public static void main(String[] args) {
        Array2D instance_array2D = new Array2D();
        instance_array2D.array_input();
    }

}
