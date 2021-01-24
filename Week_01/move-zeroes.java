class Solution {
    public void moveZeroes(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) return;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    } 
}