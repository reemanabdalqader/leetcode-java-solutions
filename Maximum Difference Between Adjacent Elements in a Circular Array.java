
//https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/description/?envType=daily-question&envId=2025-06-13
// solution use two pointer 
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int p1 =0; 
        int p2 =1 ;
        int n =nums.length;
        int ans =Integer.MIN_VALUE ;
        while (p1<n-1 ){
           int f =Math.abs(nums[p1]-nums[p2]);
           ans =Math.max(f,ans);
            p1++;
            p2++;
        }
        int s =Math.abs(nums[0]-nums[n-1]);
        ans =Math.max(s,ans);
        return ans ;
    }
}
// anther solution use %
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;  
        int ans = Integer.MIN_VALUE;  

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n; 
            int diff = Math.abs(nums[i] - nums[next]);  
            ans = Math.max(ans, diff);  
        }

        return ans;  
    }
}
