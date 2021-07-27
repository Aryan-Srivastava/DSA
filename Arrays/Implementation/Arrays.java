package Implementation;

//resizeable array
public class Arrays {

    private int[] items;
    private int count;
    //Constructor to initialize the size of the array
    Arrays(int length) {
        items = new int[length];
    }

    void insert(int item){
        //if the array is full, resize it
        if(count == items.length){
        //create a new array twice the size of the array
        int[] newItems = new int[count*2];
        //copy all the elements to it.
        for(int i = 0; i < count; i++)
            newItems[i] = items[i];
        //set "items" to this new array.
        items = newItems;
        }
        //Adding new item to the end of the array
        items[count++] = item;
    }

    void print(){
        for(int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }

    int length() {
        // int len = 0;
        // for(int i = 0; i < count; i++){
        //     len++;
        // }
        return count;
    }

    void deleteIndex(int index){

        //if index passed is invalid.
        if(index < 0 || index >= count)
            throw new IndexOutOfBoundsException();
        //iterate form the index to the end of the array
        //and shift left the elements
        //[10, 20, 30, 40, 50]
        //index to delete: 1
        //1 <- 2
        //2 <- 3
        //3 <- 4
        //[10, 30, 40, 50]
        for(int i = index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    void delete(int data){
        for(int i = 0; i < count; i++){
            if(items[i] == data){
                deleteIndex(i);
                break;
            }
        }
    }

    int indexOf(int data){
        for(int i = 0; i < count; i++){
            if(items[i] == data){
                return i;
            }
        }
        return -1;
    }

    int max(){
        int max = items[0];
        for(int i = 1; i < count; i++){
            if(items[i] > max)
                max = items[i];
        }
        return max;
    }

    void reverse(){
        int beg = 0, end = count-1;
        while(beg < end){
            int temp = items[beg];
            items[beg] = items[end];
            items[end] = temp;
            beg++;
            end--;
        }
    }

    void insertAt(int index, int data){
        if(index < 0 || index >= count)
            throw new IndexOutOfBoundsException();
        if(index == count-1){
            insert(data);
            return;
        }
        int[] newArr = new int[count+1];
        int i = 0;
        for(i = 0; i < index; i++){
            newArr[i] = items[i];
        }
        newArr[i] = data;
        for(i = index; i < count; i++){
            newArr[i+1] = items[i];
        }
        items = newArr;
        count++;
    }

    // int[] intersection(Arrays number, Arrays number2){
    //     int temp[] = new int[(number.length() >= number2.length()) ? number.length() : number2.length()];
    //     int i = 0, j = 0;
    //     while(i < number.length() && j < number2.length()){
            
    //     }
    //     return temp;
    // }

}