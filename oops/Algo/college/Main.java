package dsa.oops.Algo.college;

import java.util.Arrays;

/**
 *      Branch and Bound
 *           what to complete?
 *         Job Sequencing
 *         0/1 Knapsack
 *         TSP
 */
public class Main {

    static int mac = Integer.MAX_VALUE;
   static String sq= "";
    public static void jobSeq(int[] penalty,int[] delay  , int[] time){
        int sum = Arrays.stream(penalty).sum();
        jobSet(penalty,delay,time,0,/*t and sum*/ sum ,0 ,"");
        System.out.println(sq);
    }
    private  static void jobSet(int[] penalty, int[] delay , int[] time, int t , int sum , int index,String seq){
        if(mac>sum) {
            mac = sum;
            sq = seq;
        }
        if(index==penalty.length)return;
        for (int i = index; i < penalty.length; i++) {
            if(t<=delay[i]){
                if(sum-penalty[i]<mac) jobSet(penalty,delay,time,t+time[i],sum-penalty[i],i+1,seq+i);
            }
        }
    }
    public static void main(String[] args) {
        int[] penalty = {20, 15, 10};   // penalty for jobs
        int[] delay   = {2, 1, 2};      // allowed delay
        int[] time    = {2, 1, 2};
        jobSeq(penalty,delay,time);
        System.out.println(mac);
    }
}
