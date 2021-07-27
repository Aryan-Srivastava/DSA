package Questions;

class linkedlist {
    Node head;
    void add(int data){
        Node newNode = new Node(data); 
        newNode.next = null;
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void print(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int length(){
        if(head == null) return 0;
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    int middle(){
        Node slowptr = head;
        Node fastptr = head;
        while (fastptr.next != null && fastptr.next.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr.data;
    }
    void remove_middle(){
        if(head == null) return;
        int first = 0;
        int last = length()-1;
        int mid = (first+last)/2;
        Node temp  = head;
        for(int i = 0; i < mid-1; i++){
            temp = temp.next;
        }
        Node temp2 = temp.next.next;
        temp.next = temp2;
    }
}
public class Find_Middle_of_LinkedList {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);

        int n = list.middle();
        System.out.println(n);

        list.remove_middle();
        list.print();
    }
}
