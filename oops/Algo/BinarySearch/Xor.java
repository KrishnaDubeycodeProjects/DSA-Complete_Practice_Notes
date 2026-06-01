package BinarySearch;
public class Xor {
    public static void main(String[] args) {
       //firstly target to find the range which can be minimum value which is greater equal to k so I have to check range
        // by thing that for a max value is not decided provided and minimum 0 is XOR no shyd nahi not 0 it is max value of the
        // array which can minimized value the lower and the max value can be obtained by 0 it self
        int[] arr = {1,2,3,4,5};
        int end = max(arr);
        int start = 0;
        int result= 0;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(isValid(arr,mid,15)){
                result = mid;
                end--;
            }
            else{

                start++;
            }
        }
        System.out.println(result);
    }
    static boolean isValid(int[] arr ,int mid,int k){
        int sum = 0;
        for (int i : arr) {
            sum+=i^mid;
        }
       return (sum<=k);
    }

    static int max(int[] arr){
        int max = 0;
        for (int i : arr) {
            if(max<i){
                max= i;
            }
        }
        return max;
    }
}
