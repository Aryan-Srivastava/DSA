package Doubly_Linked_List;

public class Main_Class {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insert(10);
        list.insert(4);
        list.insert(5);
        
        list.insertAtStart(-1);

        list.insertAt(0, 6);
        list.print();

        // list.clear();
        list.deleteIndex(5);
        list.delete(0);
        
        list.print();
        list.reversePrint();
        list.print();
        int length = list.length();
        System.out.println(length);
    }
}
