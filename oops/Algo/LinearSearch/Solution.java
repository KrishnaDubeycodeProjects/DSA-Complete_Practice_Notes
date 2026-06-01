package dsa.oops.Algo.LinearSearch;
import java.util.Arrays;
class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int start =0,last =nums.length-1,mid;
        int[] arr ={-1,-1};
        int index =0;
        while(start<=last){
            mid = start + (last-start)/2;
            if(target==nums[mid]){
               int high = mid;
               int low = mid;
                for (int i = mid; i < nums.length ; i++) {

                    if(target!=nums[i]){
                        break;
                    }
                    else{
                        high = i;
                    }
                }
                for (int i = mid; i >=0; i--) {

                    if(target!=nums[i]){
                        break;
                    }
                    else{
                      low = i;
                    }
                }
              arr[0] = low;
                arr[1] = high;
                return arr;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        Arrays.sort(arr);
        if(arr[0]==-1){
            arr[0]=arr[1];
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {3,3,3};
        int[] ans;
      ans = searchRange(arr,3);
        System.out.println(Arrays.toString(ans));
    }
}
