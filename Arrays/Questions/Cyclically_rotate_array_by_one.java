package Questions;

public class Cyclically_rotate_array_by_one {
    public static void main(String[] args) {
        int array[]  = {1, 2, 3, 4, 5, 6 , 7};
        rotate(array, array.length);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void rotate(int[] array, int length) {
        int temp = array[length - 1];
        for(int i = length - 2; i >= 0; i--){
            array[i+1] = array[i];
        }
        array[0] = temp;
    }
}
