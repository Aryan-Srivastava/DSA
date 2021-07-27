package ImplementationUsingLinkedList;

import java.util.EmptyStackException;

class Node <T>{
    Node<T> next;
    T data;
    Node(T data){
        this.data = data;
        next = null;
    }
}

public class StackUsingLL <T>{

    private int size;
    private Node<T> head;
    // private Node<T> tail;

    public T pop(){
        if(head == null)
            throw new EmptyStackException();
        T temp = head.data;
        head = head.next;
        size--;
        return temp;

        // if(head == null)
        //     throw new EmptyStackException();
        // Node<T> temp = head;
        // if(head == tail){
        //     head = tail = null;
        //     size--;
        //     return temp.data;
        // }
        // Node<T> temp2 = tail;
        // while(temp.next != tail){
        //     temp = temp.next;
        // }
        // temp.next = null;
        // tail = temp;
        // size--;
        // return temp2.data;
    }

    public int size(){
        return size;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
        // if(head == null){
        //     head = tail = newNode;
        // }else{
        //     tail.next = newNode;
        //     tail = newNode;
        // }
        // size++;
    }

    public T peek(){
        if(head == null)
            throw new EmptyStackException();
        return head.data;
        // return tail.data;
    }

    public boolean isEmpty(){
        return head == null;
    }

}