package dsa.oops.Algo.LinearSearch;

class maxWealth {
    public static int maximumWealth(int[][] accounts) {
        int once =0;
        int index=0;
        int[] nums = new int[accounts.length];
        int max=0;
        int repeat=0;
        for(int[] i : accounts){
            int checker=0;
            for(int j=0 ; j<i.length ; j++){
                int check = i[j];
                checker++;
                while(j>0 && i[j-1]>check){

                    i[j] = i[j-1];
                    j--;
                }
                i[j] = check;
                j = checker-1;
            }
        }
        int Iindex=0;
        for(int[] i: accounts){

            max=i[0];
            if(max >repeat){
                repeat = max;
                nums[index] = Iindex;

            }
            else if(max ==repeat){
                index++;
                nums[index] = Iindex;
                
            }
            Iindex++;
        }
        repeat = 0;

        for(int i: nums){
            int sum =0;
            if(once!=0){
                if(i==0){
                    continue;
                }
            }
            for(int j:accounts[i]){
                sum+=j;
                if(i==0){
                    once++;
                }
            }
            if(sum>=repeat){
                repeat = sum;
            }

        }


        return repeat;

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,5},{7,3},{3,5}
        };
        System.out.println(maximumWealth(arr));
    }
}
