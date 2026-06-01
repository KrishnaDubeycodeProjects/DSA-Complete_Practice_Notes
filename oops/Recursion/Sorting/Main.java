package dsa.oops.Recursion.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[ ] arr = {3,2,1};
        insertionSort(0,0,arr,arr[0]);
//        bubble2Sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
//  static  void selectionSort(int[] arr , int c , int r){
//        if(r==arr.length)return;
//        if(c==arr.length){
//             selectionSort(arr,0,r+1);
//             return;
//        }
//        if(arr[r]>arr[c]){
//            int swap = arr[c];
//            arr[c] = arr[r];
//            arr[r] = swap;
//        }
//        selectionSort(arr,c+1,r);
//    }

//    static  void bubbleSort(int[] arr , int c , int r){
//        if(r==0)return;
//        if(c==r){
//            bubbleSort(arr,0,r-1);
//            return;
//        }
//        if(arr[c]>arr[c+1]){
//            int swap = arr[c];
//            arr[c] = arr[c+1];
//            arr[c+1] = swap;
//        }
//        bubbleSort(arr,c+1,r);
//    }
//
//
//    static  void bubble2Sort(int[] arr , int c , int r){
//        if(r==arr.length-1)return;
//        if(c==r){
//            bubble2Sort(arr,arr.length-1,r+1);
//            return;
//        }
//        if(arr[c]>arr[c-1]){
//            int swap = arr[c];
//            arr[c] = arr[c-1];
//            arr[c-1] = swap;
//        }
//        bubble2Sort(arr,c-1,r);
//    }

    static void insertionSort(int r ,int c, int[] arr,int target){
        if( c==0 || arr[c-1]<target){
            arr[c] = target;
           if(r+1<arr.length) insertionSort(r+1, r+1,arr,arr[r+1]);
          return;
        }
        if(arr[c-1]>=target){
            arr[c] = arr[c-1];
            insertionSort(r,c-1,arr,target);
        }
    }

}
