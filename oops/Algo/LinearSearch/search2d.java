package dsa.oops.Algo.LinearSearch;

public class search2d {
    static int checker =0;
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
               {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 12;
      search(arr,target);

      if(checker==0){
          System.out.println(-1);
      }
    }
    static int search(int[][] arr,int target){
        System.out.print("The "+"'"+target+"'"+" target index are : ");
        if(arr.length == 0){
            return -1;
        }
        for(int i=0 ; i< arr.length ;i++){
            for(int j= 0 ; j<arr[i].length ; j++){
                if(arr[i][j]==target){
                    if(checker>0) {
                        System.out.print(" , ");
                    }
                    checker++;
                    System.out.print("["+i+" "+j+"]");
                }

            }
        }
        return -1;
    }
}
