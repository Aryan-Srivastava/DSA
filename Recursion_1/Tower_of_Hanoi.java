public class Tower_of_Hanoi {

    static void tower(int n, char s, char a, char d){
        if(n == 1) {
            System.out.println(s + " " + d);
            return;
        }
        tower(n-1, s, d, a);
        System.out.println(s+ " " + d);
        tower(n-1, a, s, d);
    }
    public static void main(String[] args) {
        tower(2, 's', 'a', 'd');
    }
}