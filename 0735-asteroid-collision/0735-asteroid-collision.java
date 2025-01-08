class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
        
        for (int asteroid : a) {
            boolean destroyed = false;
            
            while (!s.isEmpty() && s.peek() > 0 && asteroid < 0) {
                int top = s.peek();
                if (top == -asteroid) {
                    s.pop();  // Both asteroids destroy each other
                    destroyed = true;
                    break;
                } else if (top > -asteroid) {
                    destroyed = true;  // Current asteroid is destroyed
                    break;
                } else {
                    s.pop();  // Top asteroid is destroyed
                }
            }
            
            if (!destroyed) {
                s.push(asteroid);  // Only push if not destroyed
            }
        }
        
        int[] result = new int[s.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = s.pop();
        }
        
        return result;
    }
}
