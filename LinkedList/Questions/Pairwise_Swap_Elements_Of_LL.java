package Questions;

class linked_list{
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.next = null;
        }
    }
    void print(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){ 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void swap(){
        Node temp = head;
        while(temp != null && temp.next != null){
            int x = temp.data;
            temp.data = temp.next.data;
            temp.next.data = x;
            temp = temp.next.next;
        }
    }
}
public class Pairwise_Swap_Elements_Of_LL {
    public static void main(String[] args) {
        linked_list list = new linked_list();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();
        list.swap();
        list.print();
    }
}
