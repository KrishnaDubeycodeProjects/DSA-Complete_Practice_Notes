package dsa.oops.Algo.BinarySearch;

public class ps {
    public static boolean checkPrimeFrequency(int[] arr) {
        int count =0;
        int check =0;
        for(int i = 0 ; i<arr.length ; i++){
            int z = arr[i];
            count++;
            while(i>0 && arr[i-1]>z){
                arr[i] = arr[i-1];
                i--;
            }
            arr[i]=z;
            i = count-1;

        }
        for(int i=0 ; i<arr.length ; i++){
            check =0;
            for(int j =0; j<arr.length ; j++) {
                if(arr[i]==arr[j]){
                    check ++;
                }
            }
            boolean t=   isPrime(check,2);
            if(t){
                return true;
            }

        }
        return false;
    }
    public static boolean isPrime(int num,int i){
        if(num==2){
            return true;
        }
        else if(num<2){
            return false;
        }
        else if(num%i==0){
            return false;
        }
        else{
            if(num==i+1){
                return true;
            }
            else{
                i++;
                return isPrime(num,i);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,1,6,22,1,1,0,1,1,27};
        System.out.println(checkPrimeFrequency(arr));

    }
}
