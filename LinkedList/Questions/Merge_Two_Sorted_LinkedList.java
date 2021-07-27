package Questions;

class merge{
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }
    void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    Node concat(Node node1, Node node2){
        //Node temp = new Node(0);
        //Node tail = temp;

        if(node1 == null) return node2;
        if(node2 == null)  return node1;
        if(node1.data <= node2.data){
            //tail.next = node1;
            node1.next = concat(node1.next, node2);
	    return node1;
        }else{
            //tail.next = node2;
            node2.next = concat(node1, node2.next);
	    return node2;
        }
        //tail = tail.next;
        //return temp.next;
    }
}
public class Merge_Two_Sorted_LinkedList {
    public static void main(String[] args) {
        merge list = new merge();
        list.add(10);
        list.add(55);
        list.add(70);
        
        merge list2 = new merge();
        list2.add(40);
        list2.add(50);
        list2.add(60);
        
        list.head = new merge().concat(list.head, list2.head);
        list.print();
    }
}
