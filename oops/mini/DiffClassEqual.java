package dsa.oops.mini;

import java.util.Arrays;

public class DiffClassEqual {
    static class d{
        Integer o;
        Integer[] arr;
        d(){
            // for int , boolean , String , and all of that
        }

        @Override
        public boolean equals(Object obj) {

            return Arrays.hashCode(arr)==Arrays.hashCode(((d)obj).arr);
        }
    }
    public static void main(String[] args) {
        d ojb = new d();
        d ojb3 = new d();
        Integer f = 20;
        Integer[] arr = {f, 20, 10, 2};
        ojb.arr = arr;
        ojb.o = f;
        Integer[] ar2r = {f, 20, 10, 2};
        ojb3.arr = ar2r;
        ojb3.o = f;
        Integer a = 20;
        Integer b = 10;
        System.out.println(a == b);
        a = Integer.valueOf(10);
        b = Integer.valueOf(10);
        // use caching to range -127 to 128
        System.out.println(a == b);
        System.out.println(ojb.equals(ojb3));
        Long al = 10l;
        Long bl = 10l;
        Boolean o = Boolean.TRUE;
        System.out.println(o.toString());
    }
}
