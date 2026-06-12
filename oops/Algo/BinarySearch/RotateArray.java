package dsa.oops.Algo.BinarySearch;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1};
        int peak;
        int target =0;
        if (arr[0] > arr[arr.length - 1]) {
            peak = peakRotated(arr);
            System.out.println(peak);
            System.out.println(targetRotation(arr, target, peak));
        }
        else{
            int start = 0, mid, end = arr.length - 1;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (mid ==target) {
                    System.out.println(mid);
                    break;
                }
                if (arr[mid]<target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println(-1);
        }
        }



    public static int peakRotated(int[] arr) {

        int start = 0, mid, end = arr.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid + 1 < arr.length && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[arr.length - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static int targetRotation(int[] arr, int target, int peak) {
        int start = 0, mid = -1, end = arr.length - 1;
        mid = peak;
        while (start <= end) {

            if (target == arr[mid]) {
                return mid;
            }
            if (arr[mid] > target && arr[start] <= target) {
                end = mid-1;
            } else {
                start = mid + 1;
            }mid = start + (end - start) / 2;
        }

        return -1;
    }
}
