package Questions;

class Myll{
    Node head = null,tail = null;
    void add(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null){
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }
    void print(){
        if(head == null) return; //list is empty
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void reverse(){
        Node prev = null;
        Node current = head;
        Node next = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current = prev;
        Node temp = head;
        head = tail;
        tail = temp;
    }
    // Node reverse()
    // {
    //     Node prev = null;
    //     Node current = head;
    //     Node next = null;
    //     while (current != null) {
    //         next = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next;
    //     }
    //     head = prev;
    //     return head;
    // }
}
class Main_Class{
    public static void main(String[] args) {
        Myll list = new Myll();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.print();
        list.reverse();
        list.print();
    }
}