public class Kth_Symbol_In_Grammar {
    public static void main(String[] args) {
        int n = 2;
        int k = 2;
        System.out.println(kthGrammar(n, k));
    }

    public static int kthGrammar(int n, int k) {
        if(n == 1)
            return 0;
        int parent = kthGrammar(n-1, (k+1)/2);
        if(k % 2 == 0) {
            return parent == 1 ? 0 : 1;
        } else {
            return parent;
        }
    }

// Row1	         		           0
// 				 		       /       \
// Row2			 		      0          1
// 				 	        /   \      /    \
// Row3			 	      0     1     1      0
// 				    	 / \    / \   / \   / \
// Row4			    	0  1   1   0  1  0  0  1

// Index(for Row 4)->   1  2   3   4  5  6  7  8

// the parent of kth index in nth row is
//      k/2 index in the n-1 row for even numbered indexes.
//      (k+1)/2 index in the n-1 row for odd numbered indexes.

// Also notice that the kth value of the index in nth row is:
//      flipped (reversed) value of the parent i.e. k/2 index in the n-1 row for even numbered indexes.
//      same value as for the parent i.e. the (k+1)/2 index in the n-1 row for odd numbered indexes.
}
