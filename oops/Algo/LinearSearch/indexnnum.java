package dsa.oops.Algo.LinearSearch;
//Telling all index target element present in an array

public class indexnnum {
    static int checker=0;
    public static void main(String[] args) {

        int[] arr= {6,6,6,19,8,6,3,6,8,9,5,3,32};
        linearsearch(arr,19 );
      if(checker==0){
          System.out.println(false);
      }
    }
    //search the array
    static boolean linearsearch(int[] arr, int target ){
        System.out.print("Index for the target"+" "+"'"+target+"'"+" :");
        if(arr.length == 0){
         return false;
        }
        else{int index = 0;
            //thinking that simple for loop will be more efficient as you
            // want an index of an array
            //for search in range
            for (int i = 0; i <3; i++) {

              if (arr[i] == target) {
                  checker++;
                  System.out.print(index + " ");}

              index++;
          }

        }
   return false;
    }
}
