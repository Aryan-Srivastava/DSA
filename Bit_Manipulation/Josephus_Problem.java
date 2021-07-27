
import java.util.Scanner;
/**
 * Josephus_Problem
 */
public class Josephus_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int solution = solution(n);
        System.out.println(solution);
        sc.close();
    }
    // 2^i+l 
    // first we find power of 2 (i)
    // then we find l

    private static int power(int n) {
        int i = 1;
        while(i*2 <= n) {
            i = i * 2;
        }
        return i;
    }

    private static int solution(int n) {
        int h = power(n);
        int l = n - h;
        return 2 * l + 1;
    }

}