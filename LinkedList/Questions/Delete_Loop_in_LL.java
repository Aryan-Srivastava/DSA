package Questions;
/**
 * Delete_Loop_in_LL
 */
class delete_loop{
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Function used to make a loop in the linked list at position pos.
    void makeCycle(int pos){
        Node temp = head, cycleNode = null;
        int count = 0;
        while(temp.next != null){
            if(count == pos){
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = cycleNode;
    }
    //detect whether the loop is present or not in a list.
    void detectLoop(){
        Node fastptr = head, slowptr = head;
        while(fastptr.next != null && fastptr != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(fastptr == slowptr){
                removeLoop(slowptr);
                break;
            }
        }
    }
    //removes the loop from the list.
    void removeLoop(Node loop){
        Node ptr = head, ptr2 = null;
        while (true) {
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr) 
                ptr2 = ptr2.next;
            if(ptr2.next == ptr) 
                break;
            ptr = ptr.next;
        }
        ptr2.next = null;
    }

    //returns the starting point of the loop.
    int startingPoint(){
        Node fastptr = head, slowptr = head;
        while(fastptr.next != null && fastptr != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(fastptr == slowptr){
                break;
            }
        }
        int count = 1;
        slowptr = head;
        while(fastptr != slowptr){
            fastptr = fastptr.next;
            slowptr = slowptr.next;
            count++;
        }
        return count - 1;
    }
    int NodesInLoop(){
        Node fastptr = head, slowptr = head;
        while(fastptr.next != null && fastptr != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(fastptr == slowptr){
                return count(slowptr);
            }
        }
        return 0;
    }
    private int count(Node n){
        Node temp = n;
        int res = 1;
        while(temp.next != n){
            res++;
            temp = temp.next;
        }
        return res;
    }
}
public class Delete_Loop_in_LL {
    public static void main(String[] args) {
        delete_loop list = new delete_loop();
        list.add(1);
        list.add(3);
        list.add(4);
        
        list.makeCycle(1);

        System.out.println(list.startingPoint() + "    ->  0 based indexing");
        System.out.println(list.NodesInLoop());

        list.detectLoop();
        list.print();
    }
}