package Questions;

class newlinked{
    Node head = null;
    void add(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    void rev(){
        reverse(head);
    }
    private void reverse(Node head){
        if(head == null) return;
        reverse(head.next);
        System.out.print(head.data + " ");
    }
}
public class PrintReverseOfLLWithoutReversing {
    public static void main(String[] args) {
        newlinked list = new newlinked();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        list.rev();
    }
}