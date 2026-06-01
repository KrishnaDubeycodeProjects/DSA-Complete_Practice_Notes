package dsa.oops.Algo.BinarySearch;

public class Missingnum {
    public static int missingNumber(int[] arr) {
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            if(arr[i]!= i){
                return arr[i]-1;
            }
        }
        return arr.length;
    }


    public static void main(String[] args) {
        int[] arr = {1,0};
        System.out.println(missingNumber(arr));
    }
}
