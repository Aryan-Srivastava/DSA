public class All_Indices_Of_Number {

    static int[] index(int[] arr, int x, int startIndex){
        if(startIndex >= arr.length){
            int output[] = new int[0];
            return output;
        }
        int[] smallOutput = index(arr, x, startIndex + 1);    
        if(arr[startIndex] == x){
            int output[] = new int[smallOutput.length + 1];
            output[0] = startIndex;
            for(int i = 0; i < smallOutput.length; i++)
                output[i + 1] = smallOutput[i];
            return output;
        }else{
            return smallOutput;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 54, 8, 3, 6, 5, 9, 5, 8, 3, 5};
        int x = 5;
        int temp[] = index(arr, x, 0);
        for(int i = 0; i < arr.length; i++)
            System.out.println(temp[i]);
    }
}
