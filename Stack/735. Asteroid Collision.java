class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (i > 0) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(i);
                } else if (stack.peek() == Math.abs(i)) {
                    stack.pop();
                }
            }
        }
        int[] ans = new int[stack.size()];
        for (int j = stack.size() - 1; j >= 0; j--) {
            ans[j] = stack.pop();
        }
        return ans;
    }
}