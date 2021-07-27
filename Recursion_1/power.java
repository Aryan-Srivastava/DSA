public class power {

    static int pow(int a, int b) {
        if(a==0 && b == 0) return 1;
        if(a == 0) return 0;
        if(b == 0) return 1;
        int smallAns = pow(a,b/2);
        if(b % 2 == 0){
            return smallAns * smallAns;
        }else{
            return a * smallAns *smallAns;
        }
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int power = pow(a,b);
        System.out.println(power);
    }
}