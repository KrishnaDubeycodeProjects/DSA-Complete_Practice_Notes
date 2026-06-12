package dsa.oops.Algo.prefix;

import java.util.Arrays;

public class Main {
    /*
     * Solving  a sum of rectangle by start - (a,b) to end - (c,d)
     * draw a sum of it
     */
    static int solve(int a, int b, int c, int d, int[][] arr){
        int[][] ar = new int[arr.length][arr[0].length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(j ==0){
                    ar[i][j] = arr[i][j];
                }
            else   ar[i][j] = ar[i][j-1]+arr[i][j];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                ar[j][i]+= ar[j-1][i];
            }
        }
        return  ar[a][d]-((b-1>0)?ar[a][b-1]:0)-((a-1>0)?ar[a-1][d]:0)+((a-1>0 && b-1>0)?ar[a-1][b-1]:0)+
                ar[c][d]-((b-1>0)?ar[c][b-1]:0)-((c-1>0)?ar[c-1][d]:0)+((c-1>0 && b-1>0)?ar[c-1][b-1]:0);
    }


    public static int maximumSaleItems(int[][] items, int budget) {
        int[] f = new int[items.length];
        for(int i =0 ; i<items.length ; i++){
            int sc=0;
            for(int j =0 ; j<items.length ; j++){
                if(i!=j && (items[j][0]%items[i][0])==0)sc++;
            }
            f[i] = sc;
        }

        int len= 0;
        while(budget>=0){

            float sc =Integer.MAX_VALUE;
            int ind= -1;
            for(int j =0 ; j<items.length ;j++){

                if(sc>((items[j][1])/(f[j]+1.0)) && (budget>=items[j][1])){
                    sc= Math.min(sc,(float)(items[j][1]/(f[j]+1.0)));
                    ind= j;
                }
            }
            if(ind!=-1){
                len+=f[ind]+1;
                f[ind]= 0;
                budget-=items[ind][1];
            }else return len;
        }

        return len;
    }


    public static void main(String[] args) {
       int f= maximumSaleItems(new int[][]{{86,2},{86,5}},1);
        System.out.println(f);
    }
}
