class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for(int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];
            if(nums.contains(secondNum) != -1 && nums.indexOf(secondNum) != i) {
                arr[0] = i;
                arr[1] = nums.indexOf(secondNum);
                break;
            }
        }
        return arr;
    }
}
