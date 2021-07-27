package Circular_Linked_List;

public class MainClass {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.insertAtStart(60);
        list.insertAtStart(70);

        list.print();
        list.deleteIndex(5);

        System.out.println(list.length());
        list.delete(40);

        list.insertAt(4, 100);
        list.print();

        
    }
}
