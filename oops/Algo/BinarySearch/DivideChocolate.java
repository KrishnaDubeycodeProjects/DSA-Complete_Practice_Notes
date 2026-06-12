package dsa.oops.Algo.BinarySearch;

public class DivideChocolate {
    public static void main(String[] args) {
        int[] arr= {10,20,30,20,56};
        int k =4;
        System.out.println(operatiion(arr,k));
    }
    public static int max(int[] arr){
        int max= arr[0];
        for (int i : arr) {
            if(max<i){
                max = i;
            }
        }
        return max;
    }
    public static int sum(int[] arr){
        int sum =0;
        for (int i :arr) {
            sum+=i;
        }
        return sum;
    }

    public static int operatiion(int[] arr, int k ) {
        int start = max(arr);
        int end = sum(arr);
        int result = -1;
        if (k > arr.length || k<0) {
            return -1;
        }  else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                int sum;
                int i = 0;
                int kmatch = 0;
                while (i < arr.length) {
                    sum = 0;
                    while (i < arr.length && sum + arr[i] <= mid) {
                        sum += arr[i];
                        i++;
                    }
                    kmatch++;
                }
                if (kmatch <= k) {
                    result = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }


            }
            return result;
        }
    }

}
