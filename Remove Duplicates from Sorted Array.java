//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int last = nums[0];
        int index = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] != last) {
                count++;
                last = nums[i];
                nums[index] = nums[i];
                index++;
            }
        }
        return count;
    }
}
