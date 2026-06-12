package dsa.oops.Algo.maths;
// map considered to be a Optimize form
import java.util .*;
import java.io .*;
import java.lang .*;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.in;
import static java.lang.System.out;

public class LeftDown2125B {


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

        public static long take() {
            input();
            return parseLong(stringTokenizer.nextToken());
        }

        public static long[] size(int n) {
            long[] arr = new long[n];
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

    public static long gcd(long a, long b){
        if(b ==0 )return a;
        if(a%b == 0)return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) throws IOException {
        long t = InputReader.take();
        while(t-->0){
            long a,b,k;
            a= InputReader.take();
            b= InputReader.take();
            k= InputReader.take();
            long f =gcd(a,b);
            if(a/f<=k && b/f<=k )OutputWriter.outInt(1);else OutputWriter.outInt(2);

        }
        OutputWriter.bufferedWriter.flush();
    }
}
