public class sum1toN {

    static int sum(int num){
        if(num == 1) return 1;
        return num + sum(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        int result = sum(num);
        System.out.println(result);
    }
}