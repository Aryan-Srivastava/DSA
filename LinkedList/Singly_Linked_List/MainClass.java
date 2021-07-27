package Singly_Linked_List;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        

        // list.insertAtStart(0);

        // list.insertAt(2, 10);

        // System.out.println(list.indexOf(1));
        // System.out.println(list.contains(5));
        // list.print();

        // int n = list.length();
        // System.out.println(n);
        // list.delete(5);
        // list.deleteIndex(6);

        list.print();

        // list.clear();

        // list.print();

        // int x = list.length();
        // System.out.println(x);

        var arr = list.toArray();
        System.out.println(Arrays.toString(arr));

    }
}