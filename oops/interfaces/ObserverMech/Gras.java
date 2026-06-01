package dsa.oops.interfaces.ObserverMech;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.function.*;

public class Gras {
    public  int f(){
    return 4;
    }
    public static void main(String[] args) {
        Function<Integer,String> o=(Integer a)->"";
        BiFunction<Integer,Integer,Integer> p = (Integer a,Integer d)->a+d;
        System.out.println(p.apply(5,3));
    }
}
