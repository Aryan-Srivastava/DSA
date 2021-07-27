
import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(sub(a,b));
        s.close();
    }

    
    private static int sub(int a, int b) {
        while(b!=0) {
            a  = a^b;
            b = (a&b)<<1;
        }
        return a;
    }

    // private static int sub(int a, int b){
    //     while(b!= 0){
    //         int borrow = (~a)&b;
    //         a = a ^ b;
    //         b = borrow<<1;
    //     }
    //     return a;
    // }
}
