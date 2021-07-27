package Questions;

class add1{

    Node head;
    Node newNode(int data){
        Node newnode = new Node(data);
        newnode.data = data;
        newnode.next = null;
        return newnode;

    }
    void insert(int data) {
        Node newNode = newNode(data);
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
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    Node addOne(){
        head = reverse();
        head = add1Util();
        head = reverse();
        return head;
    }
    private Node reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return prev;
    }
    private Node add1Util(){
        Node res = head, temp = null;
        int carry = 1, sum = 0;
        while(head != null){
            sum = carry + head.data;
            carry = (sum >= 10) ? 1 : 0;
            sum %= 10;
            head.data = sum;
            temp = head;
            head = head.next;
        }
        if(carry > 0) 
            temp.next = newNode(carry);
        return res;
    }
}
public class Add1toAllNumber_In_LinkedList {
    public static void main(String[] args) {
        add1 list = new add1();
        list.insert(9);
        list.insert(9);
        list.insert(9);

        list.print();
        list.addOne();
        list.print();
    }
}