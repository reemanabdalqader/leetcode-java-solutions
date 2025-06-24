//https://leetcode.com/problems/rotate-array/description/


class Solution {
    public void rotate(int[] arr, int d) {
        int n = arr.length ;
       d=d%n ;
        reverse (arr,0,n-d-1);
        reverse (arr,n-d,n-1);
        reverse (arr,0,n-1);
    }
    private void reverse (int arr[],int start ,int end ){
 while (start <end ){
    int temp =arr[start ];
    arr[start ]=arr[end ];
    arr[end]=temp; 
    start ++;
    end-- ;
 }
    }
}
// we can use ArrayList  and collections
