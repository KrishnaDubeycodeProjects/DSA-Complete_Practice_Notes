package dsa.oops.Algo;

public class Solution {
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int start = 0;
        int result = Integer.MIN_VALUE;
        int greater ;
        while(start<points.length-1){
            for(int i = start+1 ; i<points.length ; i++){
                int  dis =  points[start][0]-points[i][0];
                dis = Math.abs(dis);
                int  add = points[start][1]+points[i][1];

                if(dis<=k){
                    greater = dis+add;
                    if(greater>result)
                    { result = greater;}
                }
            }
            start++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{-19,9},{-15,-19},{-5,-8}
        };
        System.out.println( findMaxValueOfEquation(points,10));
    }
    }

