package Questions;

class newll extends linked_list {
    void swap_elements(){
        if(head == null || head.next == null) return; //if list is empty or contains only one element
        Node prev = head;
        Node current = head.next;
        head = current;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            if(next == null || next.next == null){
                prev.next = next; break;
            }
            prev.next = next.next;
            prev = next;
            current = prev.next;
        }
    }
}
public class Pairwise_Swap_By_Changing_Links {
    public static void main(String[] args) {
        newll list = new newll();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();
        list.swap_elements();
        list.print();
    }
}
