package dsa.oops.Algo.maths;
import java.util .*;
import java.io .*;
import java.lang .*;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

public class CommonDivisor1203C {


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

        public static int[] size(int n) {
            int[] arr = new int[n];
            input();
            for (int i = 0; i < n; i++) {
                arr[i] = parseInt(stringTokenizer.nextToken());
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
                bufferedWriter.flush();
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        public static void outInt(int s) {
            try {
                bufferedWriter.write(s + "");
                bufferedWriter.flush();
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        public static void outStr(int s) {
            try {
                bufferedWriter.write(s + "");
                bufferedWriter.flush();
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
                bufferedWriter.flush();
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

    public static int gcd(int a, int b){
       if(b ==0 )return a;
       if(a%b == 0)return b;
       return gcd(b,a%b);
    }
    public static void main(String[] args) {
      int t = InputReader.take();
      int[] arr = InputReader.size(t);
      int s = arr[0];
        for (int i = 1; i < t; i++) {
            s=gcd(s,arr[i]);
        }
        int div=0;
        for (int i = 1; i*i <=s; i++) {
            if(s%i ==0) {
                div++;
                if(i!=s/i){
                    div++;
                }
            }

        }
        OutputWriter.outInt(div);
    }
}
