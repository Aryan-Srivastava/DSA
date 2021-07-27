
import java.util.Scanner;

public class Sub1FromANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sub(N));
        sc.close();
    }
    // private static int sub(int N){
    //     int m = 1;
    //     while(!((N & m) > 0)){
    //         N= N^m;
    //         m = m << 1;
    //     }
    //     N = N^m;
    //     return N;
    // }
    private static int sub(int N){
        int m = 1;
        while(((~N)&m) != 0){
            N= N^m;
            m = m << 1;
        }
        N = N^m;
        return N;
    }
}
