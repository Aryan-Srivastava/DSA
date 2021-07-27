package Circular_Linked_List;

public class CircularLinkedList {
    
    Node head = null, tail = null;

    void insert(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    void insertAtStart(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }else{
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            tail.next = head;
        }
    }
    void insertAt(int index , int data){
        Node newNode = new Node(data);
        if(index < 0 || index >= length()){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0) { insertAtStart(data); return; }
        else if(index == length() - 1){ insert(data); return; }
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }else{
            Node temp = head;
            for(int i = 0; temp != null &&  i < index-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    void deleteFirst(){
        head = head.next;
        tail.next = head;
    }
    void deleteLast(){
        Node temp = head;
        do{
            temp = temp.next;
        }while(temp.next != tail);
        tail = temp;
        temp.next = null;
        tail.next = head;
    }
    void deleteIndex(int index){
        
        if(head == null) throw new IllegalArgumentException("Head is null");
        if(index < 0 || index  >= length()) throw new IndexOutOfBoundsException("Enter Valid index : 0 based indexing");

        Node temp = head;
        if(index == 0) {
            deleteFirst(); 
            return;
        }
        if(index == length() - 1) {
            deleteLast(); 
            return;
        }

        for(int i = 0; temp!=null && i < index-1; i++)
            temp = temp.next;
        
        if(temp == null || temp.next == null) return;

        Node next = temp.next.next;
        temp.next = next;
    
    }
    void delete(int data) {
        if(head == null) throw new IllegalArgumentException("Head is null");
        Node temp = head;
        Node temp2 = tail;
        if(temp.data == data) {
            deleteFirst();
            return;
        }
        else if(temp2.data == data){ 
            deleteLast(); 
            return;
        }
        while(temp != null) {
            if(temp.next.data == data) break;
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        Node n = temp.next.next;
        temp.next = n;
    }
    int length() {
        int count = 0;
        Node temp = head;
        do{
            count++;
            temp = temp.next;
        }while(temp != head);
        return count;
    }
    void print(){
        Node temp = head;
        if(head == null) throw new IllegalArgumentException("Head is null !");
        else{
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while(temp != head);
            System.out.println();
        }
    }
}