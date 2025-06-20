//https://leetcode.com/problems/longest-palindrome/description/?envType=problem-list-v2&envId=2vzv4rdm
/*

Problem Description:
Given a string s consisting of uppercase and lowercase English letters, return the length of the longest palindrome that can be built using those letters.

Letters are case sensitive, meaning 'A' and 'a' are considered different characters.

Examples:
Input: "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", which has length 7.

Input: "a"
Output: 1
Explanation: The longest palindrome that can be built is "a" itself.

Constraints:
1 <= s.length <= 2000

s contains only uppercase and/or lowercase English letters.

Approach / Explanation:
We need to count the frequency of each character in the string.

Palindromes are symmetrical: characters should appear in pairs (even counts) to be placed on both sides.*/


class Solution {
    public int longestPalindrome(String s) {
        int [] arr = new int [52];
        int n =s.length ();
        for (int i=0;i<n ;i++){
        char ch = s.charAt(i);
        int index =0 ;
        if (Character.isUpperCase (ch))
        index = (int )ch -(int )'A';
        else 
         index = (int )ch -(int )'a'+26;
         arr[index ]+=1;
        }
        boolean test =false ;
       int  count =0 ;
        for (int i=0 ;i<52 ;i++){
            int num =arr[i ];
            if(num %2!=0){
                test =true ;
                count =count +num -1;

            }else 
            count +=num ; 
        }
        return (test==true )?count+1:count  ;
    }
}
