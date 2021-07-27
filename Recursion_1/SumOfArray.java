public class SumOfArray {

    static int sumOfArr(int array[]){
        return sum(array, 0);
    }
    static int sum(int array[], int n){
        if(array.length == n) return 0;
        return array[n] + sum(array, n + 1);
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int sum = sumOfArr(a);
        System.out.println(sum);
    }
}
