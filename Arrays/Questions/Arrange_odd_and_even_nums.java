package Questions;

import java.util.Scanner;

public class Arrange_odd_and_even_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            
            int a[] = new int[n];

            // for(int i = 0; i < n; i++)
            //     a[i] = i+1;
            
            int[] res = solve(a , n);

            for(int i = 0; i <n; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
        sc.close();
    }

    public static int[] solve(int[] a, int n) {

        int start = 0, end = a.length - 1;
        int num = 1;
        while(start < end){
            a[start] = num;
            num++;
            start++;
            a[end] = num;
            num++;
            end--;
        }
        if(start == end)
            a[start] = num;
        return a;

        // int temp1[] = new int[n];
        // int j = 0;
        // for(int i = 0; i < n; i++){
        //     if(a[i] % 2 != 0){
        //         temp1[j] = a[i];
        //         j++;
        //     }
        // }

        // for(int i = n-1; i >= 0; i--){
        //     if(a[i] % 2 == 0){
        //         temp1[j] = a[i];
        //         j++;
        //     }
        // }
        // return temp1;

    }

}
