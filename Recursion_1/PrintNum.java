public class PrintNum {

    static void print(int num) {
        if(num == 0) return;
        print(num - 1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}