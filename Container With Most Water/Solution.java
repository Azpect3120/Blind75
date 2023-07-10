class Solution {
    public int maxArea(int[] height) {
        int max_value = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;

        while (left < right) {
            int volume = (right-left) * (Math.min(height[left], height[right]));
            max_value = Math.max(max_value, volume);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max_value;
    }
}
