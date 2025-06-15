//Rotate Image
//https://leetcode.com/problems/rotate-image/description/
/*
 * Problem:
 * Rotate a given n x n 2D matrix 90 degrees clockwise, in-place.
 *
 * Approach:
 * 1. Transpose the matrix → convert rows to columns.
 * 2. Reverse each row → this gives the final rotated result.
 *
 * Step 1: Transpose
 *  - Swap matrix[i][j] with matrix[j][i] for all i < j.
 *  - This reflects the matrix over its main diagonal.
 *
 * Step 2: Reverse each row
 *  - For each row, swap elements from left to right.
 *  - For example: [1, 2, 3] becomes [3, 2, 1].
 *
 * Example:
 * Input:
 *  1 2 3
 *  4 5 6
 *  7 8 9
 *
 * After transpose:
 *  1 4 7
 *  2 5 8
 *  3 6 9
 *
 * After reversing each row:
 *  7 4 1
 *  8 5 2
 *  9 6 3
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
      int n =matrix.length;
      for (int i=0;i<n;i++){
        for (int j=i;j<n ;j++){
           int temp =matrix[i][j];
            matrix [i][j]=matrix[j][i];
            matrix [j][i]=temp ;
        }
      } 
      for (int i=0;i<n;i++){
        for (int j=0;j<n/2 ;j++){
           int temp =matrix[i][n-1-j];
            matrix [i][n-1-j]=matrix[i][j];
            matrix [i][j]=temp ;
        }
      } 
      
    }
}
