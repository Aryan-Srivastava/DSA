package Questions;

class list{
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.next = null;
        }
    }
    void delete_alternate_node(){
        Node prev = head;
        Node alt = head.next;
        while(prev != null && alt != null){
            prev.next = alt.next;
            prev = prev.next;
            if(prev != null) alt = prev.next;
        }
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
        System.out.println();
    }
}
public class Delete_Alternate_Node {
    public static void main(String[] args) {
        list list = new list();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        
        list.print();
        list.delete_alternate_node();
        list.print();
    }
}
