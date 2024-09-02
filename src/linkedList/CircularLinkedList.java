package linkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    private ListNode last;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularLinkedList(){
        ListNode first = new ListNode(20);
        ListNode second = new ListNode(23);
        ListNode third = new ListNode(27);
        ListNode fourth = new ListNode(40);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display(){
        if(last == null){
            System.out.println("Null");
            return;
        }
        ListNode first = last.next;
        while (first != last){
            System.out.print(first.data + "-->");
            first = first.next;
        }
        System.out.println(first.data + " ");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
             last = newNode;
        }
        else{
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            last = newNode;
            last.next = last;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public ListNode deleteFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException("You Stupid (ಠ_ಠ)! List is Already Empty!!");
        }
        ListNode deleteValue = last.next;
        if(last == last.next){
            last = null;
        }
        else{
            last.next = deleteValue.next;
        }
        deleteValue.next = null;
        length--;
        return deleteValue;
    }

    public static void main(String[] args){
        CircularLinkedList cll = new CircularLinkedList();
        cll.createCircularLinkedList();
        System.out.println("Length :" + cll.length());
        cll.display();
//        cll.insertFirst(50);
//        cll.insertFirst(30);
//        cll.insertFirst(20);
//        cll.insertFirst(80);
//        cll.display();
//        System.out.println("Length :" + cll.length());

        cll.insertLast(2);
        cll.insertLast(15);
        cll.insertLast(7);
        cll.display();
        System.out.println("Length :" + cll.length());
        cll.deleteFirstNode();
        cll.deleteFirstNode();
        cll.deleteFirstNode();
//        cll.deleteFirstNode();
        cll.display();
    }
}
