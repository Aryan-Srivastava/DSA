package Questions;

import java.util.HashSet;

class unsorted{
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
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void removes(){
        Node prev = null, current = head;
        HashSet<Integer> set = new HashSet<>();
        while(current != null){
            if(!set.contains(current.data)){
                set.add(current.data);
                prev = current;
            }else{
                prev.next = current.next;
            }
            current = current.next;
        }
    }
}
public class Remove_Duplicate_From_UnsortedLL {
    public static void main(String[] args) {
        unsorted list = new unsorted();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);

        list.print();
        list.removes();
        list.print();
    }
}
