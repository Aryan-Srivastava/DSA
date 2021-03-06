import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean isPrime[] = sieve(100);
        for(int i =0; i<= 100; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
    static boolean[] sieve(int n ){
        //In first iteration it false the multiple of 2
        //In second iteration it false the multiple of 3
        //In third iteration it leaves the value = 4, and mark false the multiple of 5
        //The loop iteration till Square root of N times
        //0 1 2 3 4 5 6 7 8 9 10 11 12
        //F F T T F T F T F T F  T  F
        //F F T T F T F T F F F  T  F
        //    2 3   5   7        11
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){   
                for(int j = i*i; j <=n ; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    return isPrime;
    }
}
// Time complexity - O(n log n(log n))