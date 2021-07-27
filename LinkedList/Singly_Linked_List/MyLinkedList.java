package Singly_Linked_List;

import java.util.NoSuchElementException;

public class MyLinkedList {

    Node head;
    private int size;
    void insert(int data){
        var newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    void insertAtStart(int data){
        var newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    void insertAt(int index, int data){

        if(index < 0 || index >= length()){
            throw new IllegalArgumentException();
        }
        
        Node newNode = new Node(data);
        newNode.next = null;
        if(index == 0) insertAtStart(data);
        else if(index == length() - 1){ insert(data); return; }
        else{
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    void deleteIndex(int index){
        if(head == null){
            throw new IllegalArgumentException("Head is null");
        }
        if(index < 0 || index  >= length()){
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;

        if(index == 0){
            head = temp.next;
            size--;
            return;
        }
        for(int i = 0; temp!=null && i < index-1; i++)
            temp = temp.next;

        Node next = temp.next.next;
        temp.next = next;
        size--;
    }

    void delete(int data){
        if(head == null) throw new IllegalArgumentException("Head is null !");
        Node temp = head;
        boolean flag = false;
        while (temp != null && temp.next != null) {
            if(temp.next.data == data){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            Node next = temp.next.next;
            temp.next = next;
            size--;
        }else{
            throw new NoSuchElementException();
        }
    }

    void clear(){
        head = null;
        System.gc();
    }

    int length(){
        return size;
        // if(head == null) return 0;
        // Node temp = head;
        // int count = 0;
        // while(temp != null){
        //     count++;
        //     temp = temp.next;
        // }
        // return count;
    }
    
    void print(){
        if(head == null){
            throw new IllegalArgumentException("Head is null !");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int indexOf(int data){
        if(head == null) return -1;
        Node temp = head;
        boolean found = false;
        int count = 0;
        while(temp != null){
            count++;
            if(data == temp.data){
                found = true;
                break;
            }
            temp = temp.next;
        }
        if(found == true)
            return count;
        else return -1;
    }

    boolean contains(int data){
        if(head == null) return false;
        Node temp = head;
        while(temp != null){
            if(data == temp.data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    int[] toArray(){
        Node temp = head;
        int[] array = new int[size];
        int index = 0;
        while(temp != null){
            array[index++] = temp.data;
            temp = temp.next;
        }
        return array;
    }
}
