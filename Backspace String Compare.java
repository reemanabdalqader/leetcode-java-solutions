// https://leetcode.com/problems/backspace-string-compare/description/?envType=problem-list-v2&envId=rspp2t87
//use stack 
/*
Given two strings s and t, where # represents a backspace, we need to compare both strings after processing backspaces, and check if they are equal.

 Solution 1: Stack-based Simulation
 Idea:
Simulate typing into a text editor:

Use a Stack<Character> for each string.

For each character:

If it's a normal letter → push to the stack.

If it's # → pop from the stack if it's not empty.

 Why it works:
Backspace means we remove the last typed character, and a stack naturally handles that (push for typing, pop for backspace).

 Time & Space:
Time: O(n + m)

Space: O(n + m)
Where n and m are the lengths of s and t.*/
class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack <Character > stackS = buildstack (s);
       Stack <Character> stackT =buildstack  (t);
        return stackS.equals(stackT);

    }
    private  Stack <Character> buildstack (String str ){
       Stack <Character > stack = new Stack<>(); 
       for (char ch :str.toCharArray()){
        if (ch == '#'){
            if (!stack.isEmpty ()){
                stack.pop ();
            }
        }else 
        stack.push(ch);
       }
       return stack ;
    }
}
// use two pointer  (Optimized)
/*Idea:
Start from the end of both strings.

Skip characters that should be removed by backspaces.

Compare the remaining characters one by one.

Instead of building the entire final strings, we simulate the effect of backspaces while iterating backwards.

  Why it’s better:
Space optimized: No need to store final strings.

Still reads each character once.

 Time & Space:
Time: O(n + m)

Space: O(1)*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int ptrs =s.length ()-1;
        int ptrt =t.length ()-1;
       while (ptrs >= 0 || ptrt >= 0){ 
        int skips =0;
        while (ptrs>=0){
            if (s.charAt(ptrs)=='#'){
                ptrs--;
                skips++;
            }else if (skips>0){
                ptrs--;
                skips--;
            }else 
            break ;
        }
        int skipt =0;
        while (ptrt>=0){
            if (t.charAt(ptrt)=='#'){
                ptrt--;
                skipt++;
            }else if (skipt>0){
                ptrt--;
                skipt--;

            }else 
            break ;
        }
        if (ptrs>=0&& ptrt>=0){
            if (t.charAt(ptrt)!=s.charAt(ptrs))
            return false ;
        }
          else if (ptrs>=0 || ptrt>=0){
            return false ;
         }
         ptrt-- ;
         ptrs--;
       }
       return true ;
    }
}
