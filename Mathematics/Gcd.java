public class Gcd {
    public static void main(String[] args) {
        int x = 19, y = 10;
        System.out.println(gcd(x,y)); 
    }
    static int gcd(int x, int y) {
        return x%y == 0 ? y : gcd(y,x%y);
    }
}
