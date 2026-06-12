package dsa.oops.algorithm.huffman;

import java.util.Arrays;

// Creating a sort - radix , count sort and for range we have a sqrt decomposition
public class Sort {

    public static int[] sqrtDecompo(int[] arr){
        int[] ans= new int[(int)Math.ceil(Math.sqrt(arr.length)+0.00001)];
        for (int i = 0; i <arr.length; i++) {
            ans[(i/ans.length)]+=arr[i];
        }
        return ans;
    }
    public static int query(int[] ans, int l ,int r, int[] arr){
        int a=0;
        l--;
        r--;
        int start =l;
        int end= r;
        int sq =ans.length;
        if(l%sq!=0){
            start+=sq-(l%sq);
            for (int i = l; i <arr.length ; i++) {
                if(i%sq==0)break;
                a+=arr[i];
            }
        }
        if((r+1)%sq!=0){
            end-=r%sq+1;
            for (int i = r; i>=0 ; i--) {
                if((i+1)%sq==0)break;
                a+=arr[i];
            }
        }
        for (int i = start/sq; i <=end/sq; i++) {
            a+=ans[i];
        }
        return a;
    }

    public static void count(int[] arr){
        int mac = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int[] ma =new int[mac+((min<0)?-min:0)+1];
        for (int i:arr) {
            int k =((min<0)?-min:0);
            ma[i+k]++;
        }
        int index= 0;
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i]; j++) {
                arr[index] = i+min;
                index++;
            }
        }
    }

    public static void radixSort(int[] arr){
        int mac = Arrays.stream(arr).max().getAsInt();
        for (int i = 1; mac/i>0; i*=10) {
            countSort(arr,i);
        }
    }

    public static void countSort(int[] arr, int i){
       //* going forward
        int[] freq = new int[19];
        for (int j:arr) {
            if(j<0){
                freq[-(j/i)%10-1]++;
            }
          else  freq[(j/i)%10+9]++;
        }
        int preq = freq[0];
        for (int j = 1; j <=18 ; j++) {
        int next=    freq[j];
        freq[j] = (j!=1)?freq[j-1]+preq:preq;
        preq= next;
        }
        int[] output =Arrays.copyOf(arr,arr.length);

        for (int j = 0; j < arr.length; j++) {
            arr[freq[(output[j]<0)?((-output[j]/i)%10-1):(output[j]/i)%10+9]] =output[j];
            freq[(output[j]<0)?((-output[j]/i)%10-1):(output[j]/i)%10+9]++;
        }
    }

    public static void main(String[] args) {
        int[] arr ={-2394, 2, 2, 2, 2, 3, 3, 5, 6, 7, 32, 75, 230, 2345, 2350, 9204};
//      count(arr);
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
     int[] ans=   sqrtDecompo(arr);
        System.out.println(query(ans,5,9,arr));
    }
}
