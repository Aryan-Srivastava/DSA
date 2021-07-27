package Questions;

class Intersection {
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
    void print(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    Node intersection(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        Node temp = new Node(0);
        Node ptr = temp;
        while(head1 != null && head2 != null){
            if(head1.data == head2.data){
                ptr.next = new Node(head1.data);
                ptr = ptr.next;
                head1 = head1.next;
                head2 = head2.next;
            }else if(head1.data > head2.data){
                head2 = head2.next;
            }else{
                head1 = head1.next;
            }
        }
        return temp.next;
    }
}
public class Intersection_of_two_LinkedList {
    public static void main(String[] args) {
        Intersection list = new Intersection();
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Intersection list2 = new Intersection();
        list2.add(2);
        list2.add(4);
        list2.add(14);
        list2.add(16);
        list2.add(20);
        list2.add(25);
        list2.add(30);
        list2.add(35);
        list2.add(40);
        list2.add(20);
        list2.add(25);
        list2.add(30);

        Intersection obj = new Intersection();
        Node res = obj.intersection(list.head, list2.head);
        obj.print(res);
    }
}
