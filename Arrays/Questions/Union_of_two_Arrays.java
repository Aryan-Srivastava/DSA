// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1#

package Questions;

import java.util.HashSet;

/**
 * Union_of_two_Arrays
 */
public class Union_of_two_Arrays {

    public static void main(String[] args) {
        int a[] = {10, 5, 11, 65, 1, 22};
        int b[] = {5, 65, 7, 3};
        int No_of_unions = union(a, a.length, b, b.length);
        System.out.println(No_of_unions);
    }

    private static int union(int[] a, int n, int[] b, int m) {
        HashSet<Integer> h = new HashSet<>();

        for(int i = 0; i < n; i++){
            h.add(a[i]);
        }
        
        for(int i = 0; i < m; i++){
            if(!h.contains(b[i])){
                h.add(b[i]);
            }
        }
        return h.size();
    }
}