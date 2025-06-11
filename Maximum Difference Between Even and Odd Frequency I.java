//https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/?envType=daily-question&envId=2025-06-10
// method 1 : use map .

/*Given a string, find the maximum difference between the frequency of a character with an odd count and a character with an even count, 
  defined as freq(a1) - freq(a2), where a1 has an odd frequency and a2 has an even frequency.*/

class Solution {
    public int maxDifference(String s) {
   HashMap <Character ,Integer > map =new HashMap ();
   if (s.length() ==0)return 0 ;
   int n =s.length ();
    for (int i=0;i<n ;i++){
        map.put (s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
    }
    int odd =Integer.MIN_VALUE ;
    int even =Integer .MAX_VALUE ;
  for (Character ch : map.keySet()) {
    int freq = map.get(ch);
   if (freq%2==0&&freq<even )even =freq ;
   else if (freq%2!=0&&freq>odd  )odd =freq ;

}
if (odd ==Integer.MIN_VALUE)odd =0 ;
if (even ==Integer.MAX_VALUE)even =0;
return odd -even ;
}}


//method 2 : use Frequency Array 


class Solution {
    public int maxDifference(String s) {
        int arr []=new int [26];
        for (char i : s.toCharArray ()){
            arr[i-'a']++;
        }
     int odd =Integer.MIN_VALUE ;
     int even =Integer.MAX_VALUE ;
     for (int i=0;i<26;i++){
        if (arr[i]>0){
            if (arr[i]%2!=0 )odd =Math.max(odd , arr[i]);
            else even =Math.min (even , arr[i]);
        }


     }
     return odd -even ;

    }
}
