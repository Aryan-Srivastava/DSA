
import java.util.Scanner;

public class swapTwoNibbles {
    static int swapNibbles(int N) {
        //code here
        int j = (N >> 4) & 0x0F;
        int k = (N << 4) & 0xF0;
    //  int x =  sol(j,k);
    //  return x;
        return j|k;
        
    }
    // static int sol(int j, int k){
    //     int carry = 0, sum = 0;
    //     while(k != 0){
    //         sum = j ^ k;
    //         carry = (j&k)<<1;
    //         j = sum;
    //         k = carry;
    //     }
    //     return j;
    // }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(swapNibbles(N));
        scanner.close();
    }
}
