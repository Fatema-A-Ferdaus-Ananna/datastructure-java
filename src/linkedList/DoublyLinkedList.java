package linkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode previous;
        private  ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0; // head is null
    }

    public int length(){
        return length;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public ListNode deleteFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode deleteValue = head;
        if(head == tail){
            tail = null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        deleteValue.next = null;
        length--;
        return deleteValue;
    }

    public ListNode deleteLastNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode deleteValue = tail;
        if(head == tail){
            head = null;
        }
        else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        deleteValue.previous = null;
        length--;
        return deleteValue;
    }

    public void displayForward(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void displayBackward(){
        if(tail == null){
            System.out.println("Null");
            return;
        }
        ListNode current = tail;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.previous;
        }
        System.out.println("Null");
    }

    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.displayForward();
        System.out.println("Length of Doubly Linked List: " + dll.length());
        dll.insertFirst(67);
        dll.insertFirst(50);
        dll.displayBackward();
        dll.displayForward();
        dll.insertLast(100);
        dll.displayForward();
        dll.displayBackward();
        System.out.println("Length of Doubly Linked List: " + dll.length());
        dll.deleteFirstNode();
        dll.displayForward();
        dll.deleteLastNode();
        dll.displayForward();
        System.out.println("Length of Doubly Linked List: " + dll.length());
    }

}
