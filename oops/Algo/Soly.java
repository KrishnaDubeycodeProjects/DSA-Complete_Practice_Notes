package dsa.oops.Algo;
class Soly {
    public static int minSwaps(int[] nums) {
        int[] odd= new int[nums.length];
        int result = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]%2==0)odd[i]=0;
            else odd[i] = 1;
        }
        int[] numsCopy = new int[nums.length];
        System.arraycopy(odd, 0, numsCopy, 0, nums.length);
        int[] numsrestore = new int[nums.length];
        System.arraycopy(odd, 0, numsrestore, 0, nums.length);
        for(int i=0 ; i<odd.length-1 ; i++){
            if(odd[i]!=odd[i+1]){
                if(i+2<odd.length && odd[i]!=odd[i+2]){
                    int swap = odd[i+1];
                    odd[i+1] = odd[i];
                    odd[i] = swap;
                    result++;
                    break;
                }
                else{
                    break;
                }
            }
        }
        int reStore =0;
        int storeOdd = checker(odd, 0, -1, -1, 0);
        int storeNum = checker(numsrestore, 0, -1, -1, 0);
        int store = Integer.min(storeNum,storeOdd);
        if (store == -1) {
            return checkerReverse(numsCopy, numsCopy.length - 1, -1, -1, 0);
        } else if (store > -1) {
            if(store == storeOdd)
            reStore = checkerReverse(odd, nums.length - 1, -1, -1, 0);
            else{
                reStore = checkerReverse(numsrestore, nums.length - 1, -1, -1, 0);
            }
            if(reStore==0){
                if(store == storeOdd)
                return store;
                else{
                    return store;
                }
            }
        }
        return result+store;
    }

    public static int checker(int[] nums, int index, int counte, int counto, int result) {
        if (nums[index] % 2 == 0) {
            counte++;
            while (counto > 0) {
                int temp = nums[index];
                nums[index] = nums[index - 1];
                nums[index - 1] = temp;
                counto--;
                index--;
                result++;
            }
            counto = -1;
        } else {
            counto++;
            while (counte > 0) {
                int temp = nums[index];
                nums[index] = nums[index - 1];
                nums[index - 1] = temp;
                counte--;
                index--;
                result++;
            }
            counte = -1;
        }

        index++;
        if (index == nums.length) {
            if ((counte > 0 || counto > 0)) return -1;
            else return result;
        }
        return checker(nums, index, counte, counto, result);
    }

    public static int checkerReverse(int[] nums, int index, int counte, int counto, int result) {
        if (nums[index] % 2 == 0) {
            counte++;
            while (counto > 0) {
                int temp = nums[index];
                nums[index] = nums[index + 1];
                nums[index + 1] = temp;
                counto--;
                index++;
                result++;
            }
            counto = -1;
        } else {
            counto++;
            while (counte > 0) {
                int temp = nums[index];
                nums[index] = nums[index + 1];
                nums[index + 1] = temp;
                counte--;
                index++;
                result++;
            }
            counte = -1;
        }
        index--;
        if (index == -1) {
            if ((counte > 0 || counto > 0)) return -1;
            else return result;
        }
        return checkerReverse(nums, index, counte, counto, result);
    }
    public static void main(String[] args) {
        System.out.println(minSwaps(new int[]{236,307,397,520,180,559}));
    }
}