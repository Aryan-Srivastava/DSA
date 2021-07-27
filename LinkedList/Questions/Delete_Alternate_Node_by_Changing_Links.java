package Questions;

class Mylinkedlist extends list {
    Node head;
    void delete_alternate(){
        Node temp = head;
         Node current = head;
         Node temp2 = temp.next;
         while(current.next != null){
             Node temp3 = temp2.next;
             temp.next = temp3;
             temp2.next = temp;
             current = temp3;
             temp = temp3;
             temp2 = temp3.next;
         }
    }
}
public class Delete_Alternate_Node_by_Changing_Links {
    public static void main(String[] args) {
        Mylinkedlist list = new Mylinkedlist();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        
        list.print();
        list.delete_alternate();
        list.print();
    }
}