package dsa.oops.Algo.college.dp;

import java.util.*;

/**
 *            DP
 *     what to complete?
 *         0/1 Knapsack /
 *         LCS          /
 *         Edit Distance/
 *         TSP/
 *         Sum of Subsets/
 *         Multistage Graph
 *         Bellman-ford/
 *         Floyd warshall/
 *         Dijkstra's/
 */
public class Main {


    static class Node{
        int d;
        int dis;

        public Node(int d, int dis) {
            this.d = d;
            this.dis = dis;
        }
    }



    public static void shortPath(Map<Integer,List<Node>> adjacency, int src){
        // bellman ford let's think about the worst scenario
        // done
       Map<Integer,Integer> oo = new HashMap();
        for (int i:adjacency.keySet()) {
            oo.put(i,1000000000);
        }
        oo.put(src,0);
        for (int i = 0; i < adjacency.size()-1; i++) {
            for (int j : adjacency.keySet()) {
                for (Node k :adjacency.get(j)) {
                    if(k.dis!=1000000000 && oo.get(j)!=1000000000 && oo.get(j)+k.dis<oo.get(k.d)){
                        oo.put(k.d,oo.get(j)+k.dis);
                    }
                }
            }
        }
        System.out.println(oo);

        // dijkstra
        oo.clear();
        for (int i:adjacency.keySet()) {
            oo.put(i,1000000000);
        }
        oo.put(src,0);
        Map<Integer, Boolean> seen = new HashMap();
        PriorityQueue<Integer> pq= new PriorityQueue<>((n2,n1)->{
        return oo.get(n2)-oo.get(n1);
        });
        pq.offer(src);
       while(!pq.isEmpty()){
         int t=  pq.poll();
         if(!seen.getOrDefault(t,false)) {
             for (Node i :adjacency.get(t)) {
                if(oo.get(t)!=Integer.MAX_VALUE &&i.dis!=Integer.MAX_VALUE) {
                    oo.put(i.d, Math.min(i.dis+oo.get(t) ,oo.get(i.d)));
                    pq.offer(i.d);
                }
             }
             seen.put(t,true);
         }
         }
        System.out.println(oo);
       }


    public static void floydWarshall(int[][] dp){
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp.length ; j++) {
                for (int k = 0; k <dp[0].length ; k++) {
                    if(dp[j][i]!=Integer.MAX_VALUE && dp[i][k]!=Integer.MAX_VALUE)dp[j][k] = Math.min(dp[j][k],dp[j][i]+dp[i][k]);
                }
            }
        }
        for (int[] i :dp) {
            System.out.println(Arrays.toString(i));
        }
    }



    public static void sumOfSubset(int[] arr){
        List<Integer> o = new ArrayList<>();
        o.add(0);
        for (int i :arr) {
            int l = o.size();
            while(l-->0){
                o.addLast(o.getFirst()+i);
                o.addLast(o.removeFirst());
            }
        }
        System.out.println(o);
    }



    public static int tsp(int[][] arr){
        String s="";
        for (int i=1 ; i<arr.length ;i++) {
            s+=i+"";
        }
        return tsp(arr,s,0,0,0,new HashMap<>());
    }
    private static int tsp(int[][] arr,String s,int d  ,int prev , int src ,Map<String , Integer> dp){
        if(s.isEmpty())return arr[prev][src];
        if(dp.get(s)!=null)return dp.get(s);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            min = Math.min(min,tsp(arr,i==0?s.substring(1):s.substring(0,i)+((i==s.length()-1)?"":s.substring(i+1)),d,s.charAt(i)-48,src,dp)+arr[prev][s.charAt(i)-48]);
        }
       dp.put(s, Math.min(min, dp.getOrDefault(s,Integer.MAX_VALUE)));
        return dp.get(s);
    }
    static void addEdge(Map<Integer, List<Node>> adj, int src, int dest, int weight) {
        adj.putIfAbsent(src, new ArrayList<>());
        adj.get(src).add(new Node(dest, weight));
    }
    public static void main(String[] args) {
        Map<Integer, List<Node>> adjacency = new HashMap<>();


    }



    public static String LCS(String s, String t){
        String[][]dp= new String[s.length()][t.length()];
        lcs(s,t,dp,0,0);
        return  dp[0][0];
    }
    private static String lcs(String s, String t, String[][] dp , int i , int j){
        if(i == s.length()|| j==t.length())return "";
        if(dp[i][j]!=null)return dp[i][j];
        if(s.charAt(i)==t.charAt(j))return dp[i][j] =s.charAt(i)+ lcs(s,t,dp,i+1,j+1);
        String ss = lcs(s,t,dp,i+1,j);
        String st =lcs(s,t,dp,i,j+1);
        return dp[i][j] =st.length()>ss.length()?st:ss;
    }


    private static int editDistance(String s, String t) {
        int[][]dp= new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i],-1);
        }
   int os=editDistance(s,t,dp,0,0);
       return os==Integer.MAX_VALUE?-1:os;
    }
    private static int editDistance(String s, String t, int[][] dp, int i , int j){
        if(i == s.length())return t.length()-j;
        if(j == t.length())return s.length()-i;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==t.charAt(j))return dp[i][j]= editDistance(s,t,dp,i+1,j+1);
       int ad= editDistance(s,t,dp,i+1,j);
       int da =editDistance(s,t,dp,i,j+1);
        da= (da==-1)?Integer.MAX_VALUE:da;
        ad= (ad==-1)?Integer.MAX_VALUE:ad;
       return dp[i][j] = 1+Math.min(da,ad);
    }




    public static int knapsack(int[] arr , int[] weight, int cap){
        // weight value shouldn't be 0
        int[] max = new int[cap];
        for (int i = 0; i < arr.length; i++) {
            for (int j = weight[i]-1; j >=0 ; j--) {
                if(j!=0 && weight[i]+j+1<=cap)max[weight[i]+j] = Math.max(max[weight[i]+j],max[j]+arr[i]);
                if(weight[i]-1 ==j)max[i] = Math.max(max[i],arr[i]);
            }
        }
        return Arrays.stream(max).max().getAsInt();
    }

}
