//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=rspp2t87
//✨method 1 :
/*Approach
Initialize the answer as the first letter in the array.

Track the smallest positive difference between each letter's ASCII value and the target's ASCII value.

Iterate through the array:

Calculate the difference between the current letter and the target.

If the difference is positive and smaller than the current smallest difference, update the answer.

Return the final answer.*/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int sub =Integer.MAX_VALUE;
        char ans=letters[0] ;
        int tar =(int )target;
        for (int i=0;i<letters.length;i++){
          int s=( int )letters[i]; 
          if (s-tar >0 && sub > s-tar){
            sub =s-tar ;
            ans =letters[i];
          } 
        }
        return ans ;
    }
}
//✨method 2 :binary  search :
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left =0 ;
        int right = letters.length -1 ;
        while (left <=right ){
            int mid = left +(right -left )/2 ;
            if (letters[mid ]<=target )
            left =mid +1 ;
            else 
            right =mid -1 ;
        }
        if (left >=letters.length)
        return letters [0];
        else 
        return letters[left ];
        
    }
}
