package Questions;

class ll {
    Node head,tail;
    void add(int data){
        Node newNode = new Node(data); 
        newNode.next = null;
        if(head == null){
            head = tail = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
        }
    }
    void search(int data){
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(temp.data == data) break;
            temp = temp.next;
            count++;
        }
        System.out.print(count);
    }
}
public class Searching_Element {
    public static void main(String[] args) {
        ll list = new ll();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        list.search(40);
    }
}
