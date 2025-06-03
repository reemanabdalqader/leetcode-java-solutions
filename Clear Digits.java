 // Link : https://leetcode.com/problems/clear-digits/description/
class Solution {
    public String clearDigits(String s) {
     Stack <Character > stack =new Stack ();
     int n =s.length() ;

     for (int i=0;i<n;i++){
        char ch =s.charAt(i);
        if (Character.isDigit(ch)){
            if (stack.isEmpty()||Character.isDigit(stack.peek()))
              // لا يوجد حرف يمين الرقم، نحفظ الرقم
            stack.push(ch);
            else 
               // في حرف يسار الرقم، نحذف الحرف
            stack.pop ();
        }else 
        stack.push(ch );

     } 
     StringBuilder str =new StringBuilder ();
     while (!stack.isEmpty ()){
        str.append (stack.pop ());
     }
     return str.reverse (). toString (); 
    }
}
