package problemSolving.queueProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public String[] genetrateBinary(int input){
        String[] result = new String[input];
        Queue<String> q = new LinkedList<>();
        q.offer("1"); //starting with 1
        for(int i=0; i<input; i++){
            result[i] = q.poll();  // storing queue front in array
            System.out.print(result[i] + " ");
            String s1 = result[i] + "0"; // adding/concatenating 0 first/ left leaf, think as tree
            String s2 = result[i] + "1"; // adding/concatenating 1 2nd/ right leaf
            q.offer(s1);
            q.offer(s2);
        }
        return result;
    }

    public static void main(String[] args){
        System.out.print("Enter Number N to Generate Binary from 1 to N: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        GenerateBinaryNumbers gbn = new GenerateBinaryNumbers();
        System.out.print("Generate Binary from 1 to "+ inputNumber + ": ");
        gbn.genetrateBinary(inputNumber);

    }
}
