//https://leetcode.com/problems/max-consecutive-ones/submissions/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int count =0;
      int maxi =0;
      int n = nums.length ;
      for (int i=0;i<n ;i++){
        if(nums[i]==1)count ++;
        else {
            maxi=Math.max(count,maxi);
            count =0;
        }
      }  
       maxi=Math.max(count,maxi);
       return maxi ;
    }
}
