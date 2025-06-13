//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/?envType=problem-list-v2&envId=array
//time complexity :O(n)
//space complexity :O(1)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n =arr.length ;
        for (int i=0;i<n ;i++){
            int f =Math.abs (arr[i]);
            if (arr[f-1]>0)arr[f-1]*=-1;
        }
        List <Integer > list =new ArrayList ();
        for (int i=0;i<n ;i++){
            if (arr[i]>0)list.add(i+1);
        }
        return list ;

    }
}
