package Doubly_Linked_List;

public class DoublyLinkedList {

    Node head, tail;
    
    Node GetNewNode(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        newNode.prev = null;
        return newNode;
    }

    void insert(int data){

        Node newNode = GetNewNode(data);

        if(head == null){
            newNode.prev = null;
            head = tail = newNode;
            return;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
            newNode.next = null;
        }
    }

    void insertAtStart(int data){
        Node newNode = GetNewNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        newNode.prev = null;
    }

    void insertAt(int index,int data){

        if(index < 0 || index >= length()){
            throw new IndexOutOfBoundsException();
        }
        if(index == length()-1){
            insert(data);
            return;
        }
        Node newNode = GetNewNode(data);

        if(index == 0) insertAtStart(data);
        else{
            Node temp = head;
            for(int i = 0; temp != null && i < index-1; i++){
                temp = temp.next;
            }
            Node temp2 = temp.next;
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            temp2.prev = newNode;
            temp = temp2 = null;
        }
    }

    private void deleteInitial() {
        if(head == null) return;
        else{
            if(head != tail) head = head.next;
            else head = tail = null;
        }
    }
    private void deleteLast() {
        if(head == null) return;
        else{
            if(head != tail) {
                tail = tail.prev;
                tail.next = null;
            }
            else head = tail = null;
        }
    }
    void delete(int data){
        if(head == null) throw new IllegalArgumentException("Head is null !");
        Node temp = head;
        while(temp != null && temp.data != data){
            temp = temp.next;
        }
        if(head.data == data) { deleteInitial(); return;}
        else if(tail.data == data) { deleteLast(); return;}

        else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        temp = null;
    }
    
    void deleteIndex(int index){

        if(head == null) throw new IllegalArgumentException("Head is null !");

        else  if(index < 0 || index >= length()) throw new IndexOutOfBoundsException();

        Node temp = head;
        for(int i = 0; temp != null && i < index; i++)
            temp = temp.next;
        
        if(temp == null || temp.next == null) return;
        else if(temp == head) {deleteInitial(); return;}
        else if(temp == tail) {deleteLast(); return;}
        else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        temp = null;
    }
    
    void clear() {
        head = tail = null;
        System.gc();
    }
    
    int length() {
        if(head == tail) return 0;
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
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
    void reversePrint(){
        if(head == null) return;

        Node temp = tail;
        
        while(temp.prev != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
