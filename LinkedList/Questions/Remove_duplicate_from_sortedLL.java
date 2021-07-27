package Questions;

class singly{

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
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
        System.out.println();
    }
    void remove_duplicates(){
        Node temp = head;
    	while(temp.next != null && temp != null){
    	    if(temp.data == temp.next.data){
    	        temp.next = temp.next.next;
    	    }else{
    	        temp = temp.next;
    	    }
    	}
    }
}
public class Remove_duplicate_from_sortedLL {
    public static void main(String[] args) {
        singly list = new singly();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(50);

        // System.out.print("Before Removing duplicates : ");
        list.print();
        list.remove_duplicates();
        // System.out.print("After Removing duplicates : ");
        list.print();
    }
}
