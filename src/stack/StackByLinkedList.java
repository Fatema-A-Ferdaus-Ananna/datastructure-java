package stack;

import linkedList.SinglyLinkedList;

import java.util.EmptyStackException;

public class StackByLinkedList {
    private ListNode top;
    private  int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public StackByLinkedList(){
        top = null;
        length = 0;
    }

    public void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int popValue = top.data;
        top = top.next;
        length--;
        return popValue;
    }

    public int pick(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data; // pick method gives back the value of last inserted data & it is nothing but Top
    }

    public void displaySLL(){
        ListNode current = top;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] agrs){
        System.out.println("Stack:......");
        StackByLinkedList stackLL = new StackByLinkedList();
        boolean res = stackLL.isEmpty();
        System.out.println("Is Stack Empty:  " + res);
        stackLL.push(45);
        stackLL.push(34);
        System.out.print("Stack Elements: ");
        stackLL.displaySLL();
        System.out.println("Is Stack Empty:  " + stackLL.isEmpty());
        System.out.println("Pop Value:  " + stackLL.pop());
        System.out.println("Pick Value:  " + stackLL.pick());

    }
}
