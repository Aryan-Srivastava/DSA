
import java.util.Scanner;
public class Bit_Difference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long arr[] = new long[N];
        for(int i = 0; i < N; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(countBits(N, arr));
        s.close();
    }

    static int countBits(int N, long A[])
    {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < N; j++){
                if ((A[j] & (1 << i)) == 0){
                    count++;
                }
            }
            res += (count * (N - count) * 2);
        }
        return res;
    }

    // static int countBits(int N, long[] arr)
    // {
    //     int count = 0;
    //     for(int i = 0; i < N; i++){
    //         for(int j = 0; j < N; j++){
    //             count += sub(arr[i],arr[j]);
    //         }
    //     }
    //     return count;
    // }
    // static long sub(long a, long b){
    //     if(a == b){
    //         return 0;
    //     }
    //     long x = a^b;
    //     int c = 0;
    //     while(x != 0){
    //         long rmsb = (x&(-x));
    //         c++;
    //         x -= rmsb;
    //     }
    //     return c;
    // }
}