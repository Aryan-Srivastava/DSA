package Questions;

class newList{
     Node head;
     void add(int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.next = null;
        }
    }
     void loop() {
        int flag = 0;
        Node slowptr = head, fastptr = head;
        while(slowptr != null && fastptr != null && fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr == fastptr){
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("Loop Detected");
        else
            System.out.println("No Loop Detected");
    }
    void makeCycle(int pos){
        Node temp = head, cycleNode = head;
        int count = 1;
        while(temp.next != null){
            if(count == pos){
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = cycleNode;
    }
}
public class Detect_Loop {
    
    public static void main(String[] args) {
        newList list = new newList();
        list.add(20);
        list.add(45);
        list.add(12);
        list.add(45);
        list.add(88);

        //this line is used to make linked list looped.
        list.makeCycle(2);
        //function to detect the loop
        list.loop();
    }
    
}
