import java.util.Scanner;

public class kernighamAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rmsb(n));
        sc.close();
    }
    private static int rmsb(int n){
        int count = 0;
        while(n != 0) {
            int rigth_most_set_bit = n&-n; // n = n & ((~n)+1);
            n = n - rigth_most_set_bit;
            count++;
        }
        return count;
    }
}
