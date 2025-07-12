//https://leetcode.com/problems/move-zeroes/description/
// brute force
//TC =O(n)
//SC=O(N)
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer > s=new ArrayList ();
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0)
            s.add(nums[i]);
            else
            count ++ ;}
           for (int i=0;i<count ;i++){
            s.add(0);
        }
         for (int i=0;i<nums.length;i++){
            nums[i]=s.get(i);
         }
    }
}
// Two Pointer 
class Solution {
    public void moveZeroes(int[] arr) {
        int n =arr.length ;
        int i=0;
        int j=0;
        while (j<n ){
            if (arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
            j++;
        }
       while (i<n){
        arr[i]=0;
        i++;
       }
    }
}


