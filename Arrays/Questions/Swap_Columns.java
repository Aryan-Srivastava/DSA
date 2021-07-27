package Questions;

public class Swap_Columns {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                       {4, 3, 2, 1},
                       {6, 7, 8, 9}};
        int r = 3, c = 4;
        interchange(arr,r,c);
    }
    //Interchages all the columns
    // r = 3
    // c = 4
    // arr[][] = {{1, 2, 3, 4},
    //            {4, 3, 2, 1},
    //            {6, 7, 8, 9}}
    // Output:
    // 4 3 2 1
    // 1 2 3 4
    // 9 8 7 6
    static void interchange(int matrix[][], int r, int c)
    {
        if(r == c)
            return;
        else{
            int i,temp = 0, k = c-1;
            for(i = 0; i < c; i++){
                for(int j =0; j < r; j++){
                    if(k >= (c/2)){
                        temp = matrix[j][i];
                        matrix[j][i] = matrix[j][k];
                        matrix[j][k] = temp;
                    }
                }
                k--;
            }
            for(i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}