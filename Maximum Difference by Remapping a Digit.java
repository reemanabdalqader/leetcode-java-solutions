 //Maximum Difference by Remapping a Digit
//https://leetcode.com/submissions/detail/1665171783/
// first solution :
class Solution {
    public int minMaxDifference(int num) {

    String s = Integer.toString (num );
    int n = s.length ();
    int min  = Integer.MAX_VALUE ;
    int max  = Integer.MIN_VALUE ;
    for (int i=0 ;i<n ;i++){
         char digit = s.charAt(i);
       String maxstr=s.replace(digit ,'9');
       String minstr =s.replace(digit ,'0');
          int maxval = Integer.parseInt(maxstr);
            int minval = Integer.parseInt(minstr);
            min =Math.min (min , minval );
             max =Math.max (max , maxval );
    }
    return max -min  ;
    }
}
//sec solution :
class Solution {
    public int minMaxDifference(int num) {
          String s = Integer.toString(num);
          char  ch =' ';
        for (char c : s.toCharArray()) {
            if (c !='9'){
                ch =c ;
                break ;
            }
          }
         

        String max = (ch == ' ') ? s : s.replace(ch, '9');
         ch = ' ';
          for (char c : s.toCharArray()){
            if (c !='0'){
                ch =c ;
                break ;
            } }
           String min = (ch == ' ') ? s : s.replace(ch, '0');
             return Integer.parseInt(max) - Integer.parseInt (min);
         
    }
}
