package Questions;

class newLinkedList extends newll  {
    Node rev(Node head, int size){
        if(head == null)return null;
        Node prev = null;
        Node current = head;
        Node next = null;
        int i = 0;
        while(i < size && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        if(next != null){
            head.next = rev(next,size);
        }
        return prev;
    }
    void reverse(int size){
        head = rev(head,size);
    }
}
public class Reverse_LL_In_Group_Of_Given_Size {
    public static void main(String[] args) {
        newLinkedList list = new newLinkedList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        list.print();
        list.reverse(4);
        list.print();
    }
}
