//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
       Set <Integer > set =new LinkedHashSet <>();
       int n = nums.length ;
       for (int i=0;i<n ;i++){
        set.add(nums[i]);

       } 
       int count =set.size();
       int index =0;
      for (int a :set ){
        nums[index ]=a ;
        index++ ;

      }
      return count ;
    }
}

class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
      int n =  arr.length ;
      int j=1;
        while (j<n){
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        return i+1;
    }
}


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
