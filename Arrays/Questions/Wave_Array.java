package Questions;

import java.util.Scanner;

public class Wave_Array {

    static void swapArr(int arr[], int i){
        int temp = arr[i-1];
        arr[i-1] = arr[i];
        arr[i] = temp;
    }
    static void print(int arr[],int n){
        for(int i =0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for(int i=0;i<n;i++) 
            arr[i] = sc.nextInt();
        for(int i=1; i<n; i+=2){
            swapArr(arr,i);
        }
        print(arr, n);
        sc.close();
    }
}
