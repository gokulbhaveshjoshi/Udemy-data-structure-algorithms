package day_1.LinkedList;

public class SingleLinkList {

    //Represent Single LinkedList
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail
    public Node head = null;
    public Node tail = null;

    //Add node in linkedlist
    public  void addNode(int data){
        Node newNode = new Node(data);
        // Linkedlist is empty
        if(head == null){
            head = newNode;
            tail = newNode; 
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    // sort linkedlist
    public void sort(){
        Node current = head, index = null;
        int temp ;

        if(head == null){
            return;
        }
        else{
            while(current!=null){
                index = current.next;
                while(index != null){
                    if(current.data> index.data){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // display nodes
    public void display(){
        Node current = head;

        if(current == null){
                System.out.println("List is empty");
        }
        while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        SingleLinkList list = new SingleLinkList();
        list.display();

        list.addNode(10);
        list.addNode(25);
        list.addNode(45);
        list.addNode(9);
        list.addNode(45);
        list.display();
        System.out.println("sort");
        list.sort();
        list.display();
    }
}
