package linkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data; //generic type
            this.next = null;
        }
    }

    public void insertFirst(int value){
        ListNode newFirstNode = new ListNode(value);
        newFirstNode.next = head;
        head = newFirstNode;
    }

    public void insertLast(int value){
        ListNode newLastNode = new ListNode(value);
        if(head == null){
            head = newLastNode;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newLastNode;
    }

    public void insertInGivenPosition(int value, int position, int length){
        ListNode nPositionNode = new ListNode(value);
//        System.out.println("............"+ position + "....." + length);
        if (position > 0 && position <= length+1){
            if(position == 1){
                nPositionNode.next = head;
                head = nPositionNode; //new head
            }
            else{
                ListNode previousNode = head; //it will travers the whole list
                int i = 1;
                while(i< position-1){
                    previousNode = previousNode.next;
                    i++;
                }
                ListNode currentNPositionNode = previousNode.next;
                nPositionNode.next = currentNPositionNode;
                previousNode.next = nPositionNode;
            }
        }
        else{
            System.out.println("\nGive Valid Position [Hints]: 1 to "+ (length+1));
        }
    }

    public ListNode deleteFirstNode(){
        if(head == null){
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLastNode(){
        if(head == null){
            return null;
        }

        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
       previous.next = null;
        return current;
    }

    public void deleteFromGivenPosition(int position, int length){
//        System.out.println("............"+ position + "....." + length);
        ListNode nPositionNode = head;
        if (position > 0 && position <= length){
            if(position == 1){
                head = head.next;
                nPositionNode.next = null;
                System.out.println("Deleted Value: "+nPositionNode.data+" .....["+position+"st Node]" );
            }
            else{
                ListNode previousNode = head; //it will travers the whole list
                int i = 1;
                while(i < position){
                    previousNode = nPositionNode;
                    nPositionNode = nPositionNode.next;
                    i++;
                }
                previousNode.next = nPositionNode.next;
                nPositionNode.next = null;
                System.out.println("Deleted Value: "+nPositionNode.data+" .....["+position+" Position Node]" );
            }
        }
        else{
            System.out.println("\nGive Valid Position [Hints]: 1 to "+ length);
        }
    }

    public void displaySLL(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public int length(){
        ListNode current = head;
        int length = 0;
        if(head == null){
            return  0;
        }
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(20); //20--->null
        ListNode second = new ListNode(12); // 12--->null
        ListNode third = new ListNode(7); // 7--->null
        ListNode fourth = new ListNode(32); //32--->null

        //now connect them together to form a chain(the chain is singly linked list)
        sll.head.next = second; // 20--->12--->null
        second.next = third; // 20--->12--->7--->null
        third.next = fourth; // 20--->12---7--->32--->null

        sll.displaySLL();
        System.out.println("Linked List Length: " + sll.length());
        sll.insertFirst(40); //inset value at first
        sll.displaySLL();
        sll.insertLast(100); //insert value at last
        sll.displaySLL();
        sll.insertInGivenPosition(60, 0, sll.length());
        sll.displaySLL();
        sll.insertInGivenPosition(60, 1, sll.length());
        sll.displaySLL();
        System.out.println("Linked List Length: " + sll.length());
        ListNode deletedValue = sll.deleteFirstNode();
        System.out.println("Deleted Value: " +deletedValue.data + " .....[1st Node]");
        sll.displaySLL();
        System.out.println("Deleted Value: " +sll.deleteLastNode().data + " .....[Last Node]");
        sll.displaySLL();
        sll.deleteFromGivenPosition(1, sll.length());
        sll.displaySLL();
        sll.deleteFromGivenPosition(2, sll.length());
        sll.displaySLL();
    }
}
