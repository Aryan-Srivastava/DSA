package Questions;

class linked{
    Node head = null;
    void add(int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }
    void insert(int data){
        if(head == null) return;
        Node temp = head;
        Node newNode = new Node(data);
        while(temp.next.data < data){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void print(){
        if(head == null) return;
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Insertion_in_Sorted_LinkedList {
    public static void main(String[] args) {
        linked list = new linked();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.print();
        list.insert(25);
        list.print();
    }
}