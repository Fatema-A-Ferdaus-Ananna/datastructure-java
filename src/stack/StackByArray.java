package stack;

public class StackByArray {
    private int[] stack;
    private int top;
    private static final int INTIAL_SIZE = 5;

    public StackByArray(){
        stack = new int[INTIAL_SIZE];
        top = 0;
    }

    public void push(int value){   // new value on the top of the stack
        if(top == stack.length){  //stack is full
            doubleCapacity();     //double the capacity of the stack
        }
        stack[top] = value;
        top++;
    }

    public int pop(){
        if(top == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int popValue = stack[top-1];
        stack[top-1] = 0; //blank out the spot , not necessary
        top--;
        return popValue;
    }

    public int peek(){
        if(top == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int peekValue = stack[top-1]; //value of top
        return peekValue;
    }

    public int size(){
        return top; //gives the current size, total number of elements pushed to the stack
    }
    public int capacity(){  //stack capacity
        return stack.length;
    }

    public int capacityRemaining(){
        return stack.length - top;
    }

    public void empty(){ //empty all the value from stack
        for (int i=0; i<stack.length; i++){
            stack[i] = 0;
        }
        top = 0;
    }

    public void compressCapacity(){
        if(top < stack.length){
            int newCapacity = top;
            int[] newStack = new int[newCapacity];
            for (int i=0; i<top; i++){
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
    }

    public void doubleCapacity(){
        int newCapacity = 2*stack.length;
        int[] newStack = new int[newCapacity];
        for (int i=0; i<stack.length; i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public void display(){
        if(top == 0){
            System.out.println("Stack Is Empty");
        }
        else {
            System.out.print("Stack Elements: ");
            for (int i=0; i<top; i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println("");
        }
    }

    public static  void main(String[] args){
        System.out.println("Array Stack \n------------");
        StackByArray stackByArray= new StackByArray();
        stackByArray.push(30);
        stackByArray.display();
        stackByArray.compressCapacity();
        stackByArray.display();
        stackByArray.push(34);
        stackByArray.push(42);
        stackByArray.push(70);
        stackByArray.display();
        System.out.println("Stack Size: " + stackByArray.size());
//        System.out.println("Stack Capacity: " + stackByArray.capacity());
        System.out.println("Stack Pop Value: " + stackByArray.pop());
        stackByArray.display();
        System.out.println("Stack Size: " + stackByArray.size());
        stackByArray.empty();
        stackByArray.display();
//        System.out.println("Stack Capacity: " + stackByArray.capacity());

    }
}
