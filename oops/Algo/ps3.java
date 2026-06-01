package dsa.oops.Algo;
import java.util.ArrayList;
public class ps3 {
    public static void main(String[] args) {

        System.out.println( firstMissingPositive(new int[]{1}));
    }
    public static int firstMissingPositive(int[] nums) {
    ArrayList<Integer> n= new ArrayList<>();
    for(int i=1 ; i<=nums.length+1 ; i++){
        n.add(i);
    }
    //sorting
    int index = 0;
    for(int j = 0; j<nums.length ;j++){
        int z= nums[j];
        index++;
        while(j>0 && nums[j-1]>z){
            nums[j] = nums[j-1];
            j--;
        }
        nums[j] = z;
        j = index-1;
    }
    //checking
    for(int k=0 ; k<nums.length ; k++ ){
        if(n.contains(nums[k])){
            n.remove(n.indexOf(nums[k]));
        }
    }
    if(n.size()!=0) {
        return n.get(0);
    }
    else{
        return -1;
    }
}
}