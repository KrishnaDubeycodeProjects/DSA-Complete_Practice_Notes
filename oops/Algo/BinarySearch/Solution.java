package dsa.oops.Algo.BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class Solution {
//    public static void main(String[] args) {
//        int[] arr = {1,1,2,5,7};
//        System.out.println(minXor(arr, 1));
//    }
//
//    public static int minXor(int[] arr, int k) {
//        int low = 0;
//        int high = full(arr);
//        int result = -1;
//
//        if(k==arr.length)return high;
//        else if(k==0)
//        if(k<1 || k>arr.length)return -1;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (canPartition(arr, k, mid)) {
//                result = mid;
//                high = mid - 1; // Try smaller value
//            } else {
//                low = mid + 1;  // Need larger threshold
//            }
//        }
//        return result;
//    }
//
//    public static boolean canPartition(int[] arr, int k, int maxXor) {
//        int segments = 1;
//        int xor = 0;
//        for (int val : arr) {
//            xor ^= val;
//            if (xor > maxXor) {
//                segments++;
//                xor = val;
//                if (xor > maxXor) return false; // Single element too large
//            }
//        }
//        return segments <= k;
//    }
//
//    public static int full(int[] arr) {
//        int xor = arr[0];
//        for (int i : arr) {
//            if (xor < i) xor = i;
//        }
//        return xor;
//    }
//
//}
class Solution {
//    public  static int primeSubarray(int[] nums, int k) {
//        // we have to find the index of the prime numbers
//        int count =0;
//        for (int i = 0; i < nums.length-1; i++) {
//            int min = Integer.MAX_VALUE;
//            int max= Integer.MIN_VALUE;
//            int vali =0;
//            for (int j = i; j <nums.length ; j++) {
//                if(isPrime(nums[j])){
//                    min = Math.min(min,nums[j]);
//                    max = Math.max(max , nums[j]);
//                    vali++;
//                }
//                if(vali>1 && ( (min!=Integer.MAX_VALUE)||(max != Integer.MIN_VALUE)) && (max-min)<=k ) count++;
//            }
//        }
//        return count;
//    }
//    public static boolean isPrime(int n){
//        if(n==2){
//            return true;
//        }
//        else if(n<2){
//            return false;
//        }
//        for(int i= 2 ; i<=Math.sqrt(n) ; i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//
//        return true;}

//
//public static List<Integer> spiralOrder(int[][] matrix) {
//    ArrayList<Integer> ad = new ArrayList<>();
//    int top = 0;
//    int left = 0;
//    int bottom = matrix.length;
//    int right = matrix[0].length;
//    while(top<bottom && left<right){
//        for(int i=left ; i<right ; i++)ad.add(matrix[top][i]);
//        top++;
//        for(int i=top ; i<bottom ; i++)ad.add(matrix[i][right-1]);
//        right--;
//      if(top<bottom)  for(int i=right-1 ; i>=left ; i--) {
//          ad.add(matrix[bottom - 1][i]);
//      }
//      bottom--;
//      if(left<right) for(int i=bottom-1; i>=top ; i--) {
//           ad.add(matrix[i][left]);
//       }
//      left++;
//    }
//    return ad;
//}

//    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
//        int count = 1;
//        int indexr =0;
//        int[][] spiral = new int[rows*cols][2];
//        while((count<=rows*cols)){
//            int inc1 = cStart+count;
//            for(int i = cStart ; i<=inc1; i++){
//                if(rStart<rows && i>=0 && i<cols && rStart>=0 ){
//                    System.out.println(indexr + ": [" + rStart + "," + i + "]");
//                    spiral[indexr][0] = rStart;
//                    spiral[indexr][1] = i;
//                    indexr++;
//                }   if (indexr >= rows * cols) break;
//            }
//            cStart = inc1;
//            int inc = rStart+count;
//            rStart++;
//            for(int i = rStart ; i<=inc ; i++){
//                if(i<rows&& i>=0 && cStart<cols && cStart>=0 ){
//                    System.out.println(indexr + ": [" + i + "," + cStart + "]");
//                    spiral[indexr][0] = i;
//                    spiral[indexr][1] = cStart;
//                    indexr++;
//                } if (indexr >= rows * cols) break;
//            }
//            rStart = inc;
//            count = count+1;
//            int incr = cStart-count;
//            cStart--;
//            for(int i =cStart; i>=incr ; i--){
//                if(rStart<rows && i<cols && rStart>=0 && i>=0 ){
//                    System.out.println(indexr + ": [" + rStart + "," + i + "]");
//
//
//                    spiral[indexr][0] = rStart;
//                    spiral[indexr][1] = i;
//                    indexr++;
//                } if (indexr >= rows * cols) break;
//            }
//            cStart = incr;
//            int incp = rStart-count;
//            rStart--;
//            for(int i =rStart ; i>=incp ; i--){
//                if(i<rows && cStart<cols && i>=0 && cStart>=0 ){
//                    System.out.println(indexr + ": [" +i+ "," + cStart + "]");
//                    spiral[indexr][0] =i;
//                    spiral[indexr][1] = cStart;
//                    indexr++;
//                }
//                if (indexr >= rows * cols) break;
//
//            }
//            rStart = incp;
//            cStart++;
//            count= count+1;
//        }
//        return spiral;
//    }
//public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
//    int[][] spiral = new int[rows * cols][2];
//    int indexr = 0;
//    int steps = 1;

//    while (indexr < rows * cols) {
//        // Move Right
//        for (int i = 0; i < steps; i++) {
//            if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
//                spiral[indexr++] = new int[]{rStart, cStart};
//            }
//            cStart++;
//        }
//
//        // Move Down
//        for (int i = 0; i < steps; i++) {
//            if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
//                spiral[indexr++] = new int[]{rStart, cStart};
//            }
//            rStart++;
//        }
//
//        steps++;
//
//        // Move Left
//        for (int i = 0; i < steps; i++) {
//            if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
//                spiral[indexr++] = new int[]{rStart, cStart};
//            }
//            cStart--;
//        }
//
//        // Move Up
//        for (int i = 0; i < steps; i++) {
//            if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
//                spiral[indexr++] = new int[]{rStart, cStart};
//            }
//            rStart--;
//        }
//
//        steps++;
//    }
//
//    return spiral;
//}

//    public static  void setZeroes(int[][] matrix) {
//        foundZeros(matrix,0,0);
//        // return matrix;
//    }
//    static int[][] foundZeros(int[][] matrix,int row,int column){
//        if(row==matrix.length){
//            return matrix;
//        }
//        if(column==matrix[0].length){
//            return foundZeros(matrix,row+1,0);
//        }
//        if(matrix[row][column]==0){
//            //making zeros;
//            return  makeZeros(matrix,row,column);
//        }
//        else{
//            row++;
//            column++;
//            return foundZeros(matrix,row,column);
//        }
//    }
//    static int[][] makeZeros(int[][] matrix ,int row ,int column){
//        for(int i = 0; i<row ; i++){
//            if(matrix[i][column]!=0){
//                matrix[i][column]=0;
//            }
//            else
//            {
//                makeZeros(matrix,i,column);
//            }
//
//        }
//        for(int i = row+1; i<matrix.length ; i++){
//            if(matrix[i][column]!=0){
//                matrix[i][column]=0;
//            }
//            else
//            {
//                makeZeros(matrix,i,column);
//            }
//
//        }
//        for(int i =0; i<column ; i++){
//            if(matrix[row][i]!=0){
//                matrix[row][i]=0;
//            }
//            else{
//                makeZeros(matrix ,row , i);
//            }
//        }
//        for(int i =column+1; i<matrix[0].length ; i++){
//            if(matrix[row][i]!=0){
//                matrix[row][i]=0;
//            }
//            else{
//                makeZeros(matrix ,row , i);
//            }
//        }
//        return matrix;
//    }
        public static void main(String[] args) {

        }
}
