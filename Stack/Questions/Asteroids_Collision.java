package Questions;

import java.util.*;

public class Asteroids_Collision {
    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        int[] ans = (asteroidCollision(asteroids));
        System.out.println(Arrays.toString(ans));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else if (asteroids[i] + stack.peek() == 0) {
                    stack.pop();
                }
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
