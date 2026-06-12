package dsa.oops.Algo.LinearSearch;

class seaarch {
    public static int findNumbers(int[] nums) {
        int check=0;

        for(int i:nums){
            if(i==0){
                check++;
            }
            else{
                int multiplier =0;
                while(i!=0){
                    multiplier++;
                    i/=10;
                }

                if(multiplier%2!=0){
                    check--;

                }

                check++;
            }

        }
        return check;
    }

    public static void main(String[] args) {
        int[] arr = {12,34,2};
        System.out.println(findNumbers(arr));
    }
}
