//https://leetcode.com/problems/merge-sorted-array/description/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1 ;
        int j=n-1 ;
        int z= n+m-1 ;
        while (i>=0 && j>=0 ){
            if (nums1[i]>nums2[j]){
                nums1[z]=nums1[i];
                i--;
                z--;
            }else {
                nums1[z]=nums2[j];
                j--;
                z--;
            }
        }
           while (j >= 0) {
            nums1[z] = nums2[j];
            j--;
            z--;
        }
    }
}
