 //https://leetcode.com/problems/longest-palindromic-substring/description/?envType=problem-list-v2&envId=rspp2t87
// Method 1:use a (2 pointer )expand around center 
// ✨👩‍💻explain :Expand around each center by moving left and right while characters match, 
//then calculate the palindrome length as right - left - 1 to exclude the extra unmatched step.
class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end =0; 
        for (int i=0;i<s.length();i++){
            int lengodd =expandAroundCenter(s,i,i);
            int lengeven=expandAroundCenter(s,i,i+1);
            int leng= Math.max(lengodd ,lengeven );
            if (leng >end-start ){
                start =i-(leng-1)/2;
                end =i+leng/2 ;
            }

        }
        return s.substring (start, end+1);

    }
    public int expandAroundCenter(String s , int left , int right ){
        while ( left >=0 && right<s.length() && s.charAt(right )==s.charAt(left)){
            left-- ;
            right ++; 
        }
        return right - left-1;
    }
}
//method 2 :use manachers algorithm
//explain : 
