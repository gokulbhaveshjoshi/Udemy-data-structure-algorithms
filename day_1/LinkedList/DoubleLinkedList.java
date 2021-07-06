package day_1.LinkedList;

public class DoubleLinkedList {

    public static void main(String[] args) {
        DoubleLinkedList dList = new DoubleLinkedList();
        dList.addNode(18);
        dList.addNode(78);
        dList.addNode(20);
        dList.display();
    }

    // Create structure of LinkedList
    class Node{
        int data;
        Node previous;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    // Head and tail
    public Node head, tail = null;

    // Add node
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head= tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    // display list
    public void display(){
        Node current  = head;
        if(head==null){
            System.out.println("Empty list");
        }

        while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    
}
