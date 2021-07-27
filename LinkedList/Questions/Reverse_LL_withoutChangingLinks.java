package Questions;

class MyList {
    Node head;
    void add(int data){
        Node newNode = new Node(data); 
        newNode.next = null;
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void print(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int length(){
        if(head == null) return 0;
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    private Node getNode(int index){
        if(index < 0 || index >= length()){
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for(int i=0; i< index; i++){
            temp = temp.next;
        }
        return temp;
    }
    void reverseList(){
        int left = 0;
        int right = length()-1;
        while(left < right){
            Node leftNode = getNode(left);
            Node rightNode = getNode(right);

            int temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;
            left++;right--;
        }
    }
}
class mainClass{
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        list.print();
        list.reverseList();
        list.print();
    }
}