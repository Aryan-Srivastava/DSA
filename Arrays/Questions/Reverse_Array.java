package Questions;

public class Reverse_Array {
    public static void main(String[] args) {
        int array[] = {1 , 2 , 3 , 4 , 5, 6 , 7};
        reverse_array(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void reverse_array(int[] array) {
        int i = 0, j = array.length - 1;
        while(i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++; j--;
        }
    }
}
