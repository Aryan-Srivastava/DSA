import java.util.Scanner;

public class Add1ToANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(sol(N));
        scanner.close();   
    }

    private static int sol(int N) {
        int m = 1;
        while((N&m) != 0){
            N = N^m;
            m = m << 1;
        }
        N = N^m;
        return N;
    }
}
