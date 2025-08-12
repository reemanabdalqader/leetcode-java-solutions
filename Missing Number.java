//https://leetcode.com/problems/missing-number/description/
//hashing o(n)
class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
       int arr []=new int [n+1];
       for (int i=0;i<n ;i++){
        arr[nums[i]]=1;
       }
       for (int i=0;i<=n ;i++){
        if (arr[i]==0)return i;
       } 
       return n ;
    }
}

//insted loop o(n+w)
class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length ;
        boolean flag =false ;
        for (int i=0;i<=a;i++){
            flag =false ;
         for (int j=0;j<a;j++){
            if (i==nums [j]){
             flag =true ; 
             break ;  
            }}
         if (flag ==false )  return i; 
           }
           return 0;
    } 
  //optimal solution 
//sum 
  //Tc =O(n)  SC=O(1)
  class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
       int sum =(n+1)*(n);
       sum/=2;
       for (int i=0;i<n;i++){
        sum -=nums[i];
       }
       return sum ;
    }
}

  //using xor 
  class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
      int xor1=0;
      for (int i=0;i<=n ;i++){
        xor1=xor1^i;
      }
       int xor2=0;
      for (int i=0;i<n ;i++){
        xor2=xor2^nums[i];
      }
return xor1^xor2;
    }
}
  
        
}
