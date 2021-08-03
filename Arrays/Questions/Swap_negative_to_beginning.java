package Questions;

public class Swap_negative_to_beginning {
    public static void main(String[] args) {
        int array[] = {1 , -2, 5, -10, 9, -5, -6, -8, -1, 10};
        swap(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void swap(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                int temp = array[i];
                array[i] = array[count];
                array[count] = temp;
                count++;
            }
        }
    }
}
