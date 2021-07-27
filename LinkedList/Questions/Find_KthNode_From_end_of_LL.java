package Questions;

class KthNode{
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
    int length(){
        int len = 0;
        Node temp = head;
        while(temp != null) {
            len++; 
            temp = temp.next;
        }
        return len;
    }
    void ReverseSearch(int index){
        Node temp = head;
        int len = length();
        for(int i = 1; i < (len-index+1); i++)
            temp = temp.next;
        System.out.println(temp.data);
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
}
public class Find_KthNode_From_end_of_LL {

    public static void main(String[] args) {
        KthNode list = new KthNode();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.ReverseSearch(4);
        list.print();
    }
}