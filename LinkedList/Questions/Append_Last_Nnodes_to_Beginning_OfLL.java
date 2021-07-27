package Questions;

class mylinked{
    Node head;

    void add(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.next = null;
        }
    }
    int length(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++; temp = temp.next;
        }
        return count;
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

    Node ap(int k){
        if(head == null || head.next == null || k == 0) return null;
        int l = length();
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = head;
        k = k % l;
        k = l - k;
        while(k-- > 0)
            temp = temp.next;
        head = temp.next;
        temp.next = null;
        return head;
    }
    // void append(int k){
    //     if(head == null || head.next == null || k == 0) return;
    //     else{
    //         int len = length();
    //         k = k % len;
    //         int last = len - k - 1;
    //         Node lastNode = head;
    //         Node headptr = head;
    //         for(int i = 0; i < last && lastNode != null; i++)
    //             lastNode = lastNode.next;
    //         Node newHead = lastNode.next;
    //         Node temp = newHead;
    //         while(temp.next != null && temp != null)
    //             temp = temp.next;
    //         temp.next = headptr;
    //         lastNode.next = null;
    //         head = newHead;
    //     }
    // }
}
public class Append_Last_Nnodes_to_Beginning_OfLL {
    public static void main(String[] args) {
        mylinked list = new mylinked();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list.print();
        list.ap(5);
        list.print();
    }
}