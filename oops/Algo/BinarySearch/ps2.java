package dsa.oops.Algo.BinarySearch;

public class ps2 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0};
        int result=0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                ans= 0;
                for (int k = i; k <= j; k++) {
                    ans+=arr[k];
                }
                if(ans==0){
                    ans=1;
                }  result += ans;
            }


        }
        System.out.println(result + " is the ans");
    }
}
