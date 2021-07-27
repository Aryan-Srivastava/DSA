package Questions;

class mergeSort{

    //TODO: fix this program.
    //!Not working.
    
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
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
    Node sort(Node head){
        if(head == null || head.next == null) return head;
        Node middle = middle(head);
        Node nextofMiddle = middle.next;
        middle.next = null;
        Node left = sort(head.next);
        Node right = sort(nextofMiddle);
        Node sort = concat(left, right);
        return sort;
    }
    private Node middle(Node curr) {
        Node hare = curr, turtle = curr;
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    private Node concat(Node node1, Node node2){
        Node temp = new Node(0);
        Node tail = temp;
        if(node1 == null) return node2;
        if(node2 == null) return node1;
        if(node1.data <= node2.data){
            tail.next = node1;
            node1.next = concat(node1.next, node2);
        }else{
            tail.next = node2;
            node2.next = concat(node1, node2.next);
        }
        tail = tail.next;
        return temp.next;
    }
}
public class Merge_Sort_LinkedList {
    public static void main(String[] args) {
         mergeSort list = new mergeSort();
         list.add(10);
         list.add(65);
         list.add(20);
         list.add(5);
         list.add(26);
         list.add(42);

         list.sort(list.head);
         list.print();
    }
}