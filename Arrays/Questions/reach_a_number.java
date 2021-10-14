package Questions;

public class reach_a_number {
    public static void main(String[] args) {
        System.out.println(reachNumber(2));
        System.out.println(reachNum(2));
        System.out.println(reachNum2(2));
    }

    // Method 1 -
    private static int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0, step = 0;
        while (sum < target) {
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }

    // Method 2 -
    private static int reachNum2(int target) {
        long t = Math.abs(target);
        long n = (long) Math.ceil((-1.0 + Math.sqrt(1 + 8.0 * t)) / 2);
        long sum = n * (n + 1) / 2;
        if ((sum - target & 1) == 0) {
            return (int) n;
        } else {
            return (int) n + (((sum - target + n + 1) & 1) == 0 ? 1 : 2);
        }
    }

    // Method 3 -
    private static int reachNum(int target) {
        target = Math.abs(target);
        int steps = 0;
        while (target > 0)
            target -= ++steps;
        return (target % 2 == 0) ? steps : (steps + 1 + steps % 2);
    }
}
