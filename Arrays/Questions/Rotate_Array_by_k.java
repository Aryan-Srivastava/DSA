package Questions;

import java.util.Scanner;

public class Rotate_Array_by_k {

    static void left_rotate(int arr[], int k){

        if(k == 0) return;
        int length_of_array = arr.length;
        //This statement checks whether the entered rotating factor k is within the length of the array
        k = k % length_of_array;
        //first rotate the array from 0 ot k-1
        //1 2 3 4 5 6 7
        //k = 2;
        //[2 1] 3 4 5 6 7
        reverse_array(arr, 0, k);
        //the rotate the array from k to n-1
        //2 1 [7 6 5 4 3]
        reverse_array(arr, k+1, length_of_array-1);
        //then rotate the whole array from beginning to end
        //3 4 5 6 7 1 2
        reverse_array(arr, 0, length_of_array-1);
    }
    static void reverse_array(int arr[], int start, int end){
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }
    }
    static void print_array(int arr[]){
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length_of_array = sc.nextInt();

        System.out.println("Enter Array of length : " + length_of_array);
        int arr[] = new int[length_of_array];
        for(int i = 0; i < length_of_array; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("Enter the key");
        int k = sc.nextInt();
        left_rotate(arr,k);
        print_array(arr);
        sc.close();
    }
}