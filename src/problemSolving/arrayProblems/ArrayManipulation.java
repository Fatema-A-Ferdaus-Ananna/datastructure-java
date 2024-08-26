package problemSolving.arrayProblems;

import java.util.Scanner;

public class ArrayManipulation {
    static Scanner scanner = new Scanner(System.in);

    public static  int[][] matrix(int n){
        int[][] arr = new int[n][3];

        for(int i=0; i<n; i++){
            System.out.print("Querie "+ (i+1) + "   : ");
            for (int j=0; j<3; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        return arr;
    }


    public static long arrayManipulation(int n, int[][] queries) {
        // Write your code here
        long[] arr = new long[n+1]; //n=10 means indes 0-9 but in line 40 b+1 = 10 is index number & this arr[1] to arr[10]
        int a=0, b=0, k=0;
        long max = 0;

        for(int i=0; i<queries.length; i++){
            a = queries[i][0];
            b = queries[i][1];
            k = queries[i][2];

            arr[a] = arr[a] + k;
            if((b+1)<=n){
                arr[b+1] = arr[b+1] - k;
            }
        }

        for(int j=1; j<=n; j++){
            arr[j] = arr[j] + arr[j-1];
            if(max<arr[j]){
                max = arr[j];
            }
        }
        return max;
    }


    public static void main(String args[]){
//        Scanner scanner = new Scanner(System.in); //create scanner obj

        System.out.print("Enter Input Number:");
        int inputNum = scanner.nextInt();
        System.out.print("Enter Queries Number:");
        int queriesNum = scanner.nextInt();
        int[][] queriseMx = matrix(queriesNum);
        System.out.println("I:" + inputNum + "  " +
                           "Q:" +queriesNum);

        long maxValue = arrayManipulation(inputNum, queriseMx);
        System.out.print("Max Value: " + maxValue);
    }
}
