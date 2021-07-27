package Questions;

class mysinglyLL{
    
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.next = null;
        }
    }
    private Node getNode(int index){
        if(index < 0 || index >= length()) return null;
        Node temp = head;
        int i = 0;
        while(i < index){
            temp = temp.next; i++;
        }
        return temp;
    }
    int  length() {
        if(head == null)return 0;
        int len = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next; len++;
        }
        return len;
    }
    boolean isPalindrome(){
        int first = 0, last = length() - 1;
        while(first < last){
            Node left = getNode(first);
            Node right = getNode(last);
            if(left.data != right.data){
                return false;
            }
            first++; last--;
        }
        return true;
    }
}
public class Palindrome_or_not {
    public static void main(String[] args) {
        mysinglyLL list = new mysinglyLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(1);

        boolean ispalin = list.isPalindrome();
        System.out.println(ispalin);
    }
}