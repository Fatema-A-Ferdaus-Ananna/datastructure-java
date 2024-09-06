package problemSolving.stackProblems;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static String reverseString(String inputString){
        Stack<Character> characterStack = new Stack<>();
        char[] charArray = inputString.toCharArray();

        for(char c : charArray){
            characterStack.push(c);
        }

        for (int i=0; i<inputString.length(); i++){
            charArray[i] = characterStack.pop();
        }
        return new String(charArray);
    }

    public static void main(String[] args){
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Before Reversing The String: " + string);
        System.out.println("Before Reversing The String: " +  reverseString(string));




    }
}
