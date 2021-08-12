package Questions;

public class All_Repteing_twice_Except_two_Nums {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 2, 3, 4, 3 };
        find(arr);
    }

    private static void find(int[] arr) {
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        int first = 0, second = 0;
        int rmsb = xor & -xor;
        for (int i : arr) {
            if ((i & rmsb) == 0)
                first = first ^ i;
            else
                second = second ^ i;
        }
        System.out.println(first + " " + second);
    }
}
