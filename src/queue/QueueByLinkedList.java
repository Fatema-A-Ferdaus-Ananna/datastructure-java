package queue;

import java.util.EmptyStackException;

public class QueueByLinkedList {
    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    public QueueByLinkedList(){
        front = null;
        rear = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            front = newNode;
        }
        else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public ListNode dequeue(){
        if (isEmpty()){
            System.out.println("Empty Queue!");
            throw new EmptyStackException();
        }
        ListNode current = front; // int removeData = front.data
        front = front.next;
        current.next = null;   // if using in, no needed this line
        if(front == null){
            rear = null;
        }
        length--;
        return current;  // return removeData & method type wil be int
    }

    public void display(){
        if(isEmpty()){
            System.out.println("The queue is empty, just like my wallet is empty!(╥﹏╥)");
            return;
        }

        ListNode current = front;
        System.out.print("The Queue Elements: ");
        while (current!=null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args){
        QueueByLinkedList qll = new QueueByLinkedList();
        qll.display();
        qll.enqueue(28);
        qll.enqueue(18);
        qll.enqueue(48);
        qll.display();
        System.out.println("Queue Length: " + qll.length());
        System.out.println("Remove Data from Queue: " + qll.dequeue().data);
        qll.display();
//        qll.dequeue();
//        qll.dequeue();
//        qll.dequeue();
        System.out.println("Queue Length: " + qll.length());
    }
}
