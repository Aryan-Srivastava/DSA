public class NumOfDigitsInNum {
    
    static int digits(int num) {
        if(num == 0) return 0;
        int count = digits(num / 10);
        return count + 1;
    }
    public static void main(String[] args) {
        int num = 9999;
        int res = digits(num);
        System.out.println(res);
    }
}
