//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
/*
Problem Description
Given an integer array, determine if the array is:

Sorted in non-decreasing order (each element is less than or equal to the next), or

Sorted and then rotated (the array was originally sorted but then rotated some number of times).

  Approach
Count the number of times the current element is greater than the next element.

Allow at most one such occurrence because the array might be rotated.

Compare the last element with the first to handle the rotation properly.
  Explanation
The loop iterates over the entire array.

Using modulo % allows us to compare the last element with the first element, ensuring circular comparison.

If more than one "break" in sorting order is found (arr[i] > arr[next]), the array is not sorted and rotated properly.

Otherwise, return true.

*/
class Solution {
    public boolean check(int[] arr) {
      int pntr =0;
      boolean test =false ;
    int n =arr.length ;
      for (int i=0;i<n;i++){
        int next = (i + 1) % n;
        if (arr[i]>arr[next ]){
            if (test==false )
            test=true ;
            else
            return false ;
        }
      }  
      return true ;
    }
}
