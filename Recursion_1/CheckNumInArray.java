public class CheckNumInArray {

    //linear search
    static boolean checkNum(int[] num, int x, int index) {
        if(index == num.length) return false;
        if(num[index] == x) return true;
        return checkNum(num, x, index + 1);
    }

    static boolean checkNum(int num[], int x){
        return checkNum(num,x,0);
    }

    public static void main(String[] args) {
        int array[] = {1, 4, 65, 23, 54};
        int x = 54;
        boolean result = checkNum(array, x);
        System.out.println(result);
    }
}
