
import java.util.Scanner;

public class countNumOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("total : "+countSetBits(n));
        sc.close();
    }

    static int countSetBits(int n){
         
        int two = 2;
        n = n+1;
        int count = n/2;
        while(two <= n){
            int totalpair = n/two;
            count += (totalpair / 2) * two;
            count += (totalpair % 2 == 1) ? (n % two) : 0;
            two = two << 1;
        }
        return count;
    }
    
    // int count = 0, total = 0 , k = n, l = n;
    //     for(int i = 1; i <= n; i++){
    //         while(k != 0){
    //             int rmsb = k & -k;
    //             k = k - rmsb;
    //             count++;
    //         }
    //         total = total + count;
    //         l--;
    //         k = l;
    //         count = 0;
    //     }
    //     return total;
}
