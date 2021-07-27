package Implementation;

//Resizeable array
//! complete the intersection part
public class MainClass {
    public static void main(String[] args) {

        Arrays number = new Arrays(3);
        number.insert(10);
        number.insert(20);
        number.insert(30);
        number.insert(40);
        number.insert(50);

        Arrays number2 = new Arrays(3);
        number2.insert(25);
        number2.insert(30);
        number2.insert(35);
        number2.insert(40);
        number2.insert(45);
        number2.insert(500);
        // number.delete(50);
        // number.deleteIndex(1);

        // System.out.println(number.indexOf(40));
        // System.out.println("Length : "+number.length());

        // System.out.println(number.max());

        // number.insertAt(2, 100);
        
        // Arrays num = new Arrays(3);
        // int arr[] = num.intersection(number, number2);
        number.print();
        System.out.println(number.length());
        
        // number.reverse();

        // number.print();
    }
}
