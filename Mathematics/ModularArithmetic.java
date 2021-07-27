//fastPower
public class ModularArithmetic {
    public static void main(String[] args) {
        int m = 1000000007;
        long a = 2;
        long b = 10;
        System.out.println(fastPower(a,b,m));
    }
    static long fastPower(long a,long b, int n) {
        long res = 1;
        while(b > 0){
            if((b&1) != 0){
                res = (res*a%n)%n;
            }
            a = (a%n * a%n)%n;
            b = b>>1;
        }
        return res;
    }
}
