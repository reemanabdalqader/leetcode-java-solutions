 //Palindromic Substrings
 // https://leetcode.com/problems/palindromic-substrings/description/?envType=problem-list-v2&envId=rspp2t87
/*Problem Description
Given a string s, the task is to find how many substrings of s are palindromes.

A palindrome is a string that reads the same backward as forward, e.g., "a", "aa", "aba".

A substring is a contiguous sequence of characters within the string.

Approach: Expand Around Center
The key insight is that every palindrome is centered around a character or between two characters.

How it works:
Iterate through each index i in the string as a potential palindrome center.

For each center, try to expand outward (left and right pointers) to find all palindromes centered there.

We need to consider two cases:

Odd-length palindromes: Center is a single character (left = right = i).

Even-length palindromes: Center is between two characters (left = i, right = i+1).

Count all palindromes found while expanding.

This method ensures we count all palindromic substrings in O(n²) time with O(1) extra space.*/
class Solution {
    public int countSubstrings(String s) {
        int count =0 ;
        int n =s.length ();
        for (int i=0;i<n ;i++){
            count +=center (i,i,s);
            count +=center(i,i+1,s);
        }
        return count ;
    }
    private int center (int left ,int right , String str ){
        int  count =0;
        while (left>=0 && right <str.length ()&& str.charAt(left)==str.charAt(right )){
            left--;
            right ++;
            count ++;
        }
        return count ; 
    }
}
