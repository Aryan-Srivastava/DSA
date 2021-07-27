import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(add(a,b));
        sc.close();
    }

    private static int add(int a, int b) {
        while(b != 0) {
            int carry = a & b;
            a  = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    // private static int sub(int a, int b) {
    //     while(b!=0) {
    //         a  = a^b;
    //         b = ((~a)&b)<<1;           
    //     }
    //     return a;
    // }
}
