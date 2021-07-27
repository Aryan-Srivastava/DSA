public class factorial {

    static int fact(int x) {
        if(x == 0) return 1;
        return x * fact(x - 1);
    }
    public static void main(String[] args) {
        int f = 5;
        int res = fact(f);
        System.out.println(res);
    }
}
