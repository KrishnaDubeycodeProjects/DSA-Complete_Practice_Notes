package dsa.oops.Algo.maths;
import java.util .*;
import java.io .*;
import java.lang .*;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.*;

import java.math.BigDecimal;

public class InsertEqualize19902C {

   public static class Interface<A extends Number>{
        A[] arr;
        A var;

       public Interface(A[] arr, A var) {
           this.arr = arr;
           this.var = var;
       }
   }
    @SuppressWarnings("unchecked")
    private static <A extends Number> A max(A[] arr){

        return (A) Arrays.stream(new Interface<A>(arr,arr[0]).arr).max((a1, a2)->{
     BigDecimal f= new BigDecimal(String.valueOf(a1));
     BigDecimal f2= new BigDecimal(String.valueOf(a2));
      return f.compareTo(f2);
        }).get();
    }

    class InputReader implements AutoCloseable {
        private static final BufferedReader obj = new BufferedReader(new InputStreamReader(in));
        public static StringTokenizer stringTokenizer;

        public static void input() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(obj.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static int take() {
            input();
            return parseInt(stringTokenizer.nextToken());
        }

        public static Long[] size(int n) {
            Long[] arr = new Long[n];
            input();
            for (int i = 0; i < n; i++) {
                arr[i] = parseLong(stringTokenizer.nextToken());
            }
            return arr;
        }

        public void close() throws Exception {
            obj.close();
        }
    }

    class OutputWriter implements AutoCloseable {
        private static final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(out));

        public static void outStr(String s) {
            try {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        public static void outLong(long s) {
            try {
                bufferedWriter.write(s + "");
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        public static void outInt(int s) {
            try {
                bufferedWriter.write(s + "");
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        public static void outStr(int s) {
            try {
                bufferedWriter.write(s + "");
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        public static void outArray(int[] arr) {
            try {
                for (int i : arr) {
                    bufferedWriter.write(i + " ");
                }

                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void close() {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
 static   boolean find(Long[] ar , long v){
       boolean f = false;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==v)return true;
        }
       return f;
    }


    public static long gcd(long a, long b){
        if(b ==0 )return a;
        if(a%b == 0)return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) throws IOException {
        out.println(maximumSum(new int[]{4,1,-5,2},2,1,3));
//        long t = InputReader.take();
//        while(t-->0){
//            int a;
//            a= InputReader.take();
//
//            Long[] arr =InputReader.size(a);
//            Map<Long,Integer> o = new HashMap<>();
//           if(a == 1){
//               OutputWriter.outLong(1);
//               continue;
//           }
//           long s = 0;
//           Arrays.sort(arr);
//           Long max= arr[arr.length-1];
//           o.merge(max,1,Integer::sum);
//            for (int i = 0; i < a-1; i++) {
//                s= gcd(s,Math.abs(arr[i]-max));
//                o.merge(arr[i],1,Integer::sum);
//            }
//            int len = a;
//            long val = max-s;
//               while(o.containsKey(val) && len>0) {
//                   val -= s;
//                   len--;
//               }
//               Arrays.stream(arr).max((n1,n2)->{return n1.compareTo(n2);}).get();
//            if(len == 0){
//                long ans=0;
//                for (int i = 0; i <arr.length ; i++) {
//                    ans+=Math.abs(arr[i]-(max+s))/s;
//                }
//                OutputWriter.outLong(ans);
//            }
//            else{
//                long ans=0;
//                for (int i = 0; i <arr.length ; i++) {
//                    ans+=Math.abs(arr[i]-max)/s;
//                }
//                OutputWriter.outLong(ans+(Math.abs(max-val)/s));
//            }
//
//        }
//        OutputWriter.bufferedWriter.flush();
        out.println(Arrays.toString(maximumMEX(
                new int[]
                        {0,1,2,6,50,1,2,6,5,0,1,3,4,0,1,2,6,5,0,1,3,4,0,1,2,6,5,
                        0,1,3,4,0,1,3,0,1,2,6,5,0,1,3,4,0,1,2,6,5,0,1,3,4,
                        0,1,2,6,5,0,1,3,4,0,1,2,6,5,0,1,3,4,0,1,2,6,5,0,1,
                        3,4,0,1,2,6,5,0,1,3,4,0,1,2,6,5,0,1,3,4,4})));

    }


    public static int[] maximumMEX(int[] nums) {
        // log operation of finding a number effective
        // just have to find the number having a effective role of last index how much
        /*
      simple O(N) Solution observe like a playgame
      just to make a sequence 0,1,2,3,4 like that to make max MEX and with a low possible length so that many MEX can compute that's the overall intitution and let's solve

        */
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i =0 ; i<nums.length ;i++){
            List<Integer> obj = map.getOrDefault(nums[i],new ArrayList<>());
            obj.addLast(i);
            map.put(nums[i],obj);
        }
        List<Integer> as= new ArrayList<>();
        int cu =0;
        int min =0;
        while(!map.getOrDefault(cu,new ArrayList<>()).isEmpty()){
            int t =min;
            boolean f= false;
            while(!map.getOrDefault(cu,new ArrayList<>()).isEmpty())
            {
                List<Integer> obj= map.get(cu);
                while(!obj.isEmpty() && min>obj.getFirst()){
                    obj.removeFirst();
                }
                if(obj.isEmpty())break;
               f= true;
                t = Math.max(obj.removeFirst(),t);
                cu++;
            }
            if(cu>0) as.addLast(cu);
            cu=0;
          if(f)  min = t+1;
        }
        while(min<nums.length){as.add(0);
            min++;}
        int[] arr= new int[as.size()]
                ;int ind= 0;
        while(!as.isEmpty()){
            arr[ind]=as.removeFirst();
            ind++;
        }
        return arr;   }

    public static int maximumSaleItems(int[][] items, int budget) {
        int[] f = new int[items.length];
        for(int i =0 ; i<items.length ; i++){
            int sc=0;
            for(int j =0 ; j<items.length ; j++){
                if(i!=j && (items[j][0]%items[i][0])==0)sc++;
            }
            f[i] = sc;
            List<Integer> as= new ArrayList<>();

        }
        Integer[] bud= new Integer[budget];
        Arrays.fill(bud,0);
        for(int i =0 ; i<items.length ;i++){
            for(int j =items.length-1;j>=0;j--) {
                if (bud[j] != 0 && j + 1 + items[i][1] <= budget)
                    bud[items[i][1] + j] = Math.max(bud[items[i][1] + j], f[i] + 1 + bud[j]);
                if (j == items[i][1]-1 && items[i][1] <= budget) bud[items[i][1] - 1] = Math.max(bud[items[i][1] - 1], f[i] + 1);
            }

        }

        for(int i =0 ;i<items.length ;i++){
            for(int j =0 ; j<budget; j++){
                if(bud[j]!=0 && j+items[i][1]+1<=budget)bud[j+items[i][1]] = Math.max(bud[j+items[i][1]],bud[j]+1);
            }
        }
        return Arrays.stream(bud).max((n1,n2)->{return n1.compareTo(n2);}).get();
    }

    public  static long maximumSum(int[] nums, int m, int l, int r) {
        int len = (r-l)+1;
        int ind= 0;
        long a =0;
        boolean neg =false;
        for(int i:nums)if(i>=0)neg= true;
        if(!neg){
            return Arrays.stream(nums).min().getAsInt();
        }
        List<Long> o = new ArrayList<>();
        for(int i=0 ; i<nums.length;){
            if(nums[i]<0)continue;
            long cal =0;
            for(int j=i ; j<nums.length && j<i+len ;j++){

                cal+=nums[j];
                if(a<cal){
                    a= cal;
                    ind = j;
                }
            }
            System.out.println(a);
            o.add(a);
            a=0;
            i =ind+1;
            ind= i;
        }
        Collections.sort(o);
        long ans =0;
        for(int i=o.size()-1; i>o.size()-1-m && i>=0;i--){
            ans+=o.get(i);
            break;
        }
        return ans;
    }

}
