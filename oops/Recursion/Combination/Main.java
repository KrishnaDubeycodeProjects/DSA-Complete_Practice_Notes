package dsa.oops.Recursion.Combination;

import dsa.oops.interfaces.nested.A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> obj = new ArrayList<>();
        String ob = "Krishna";
        ArrayList<String> op = new ArrayList<>();
        op.add("");
        obj.add(op);
        for (int i = 0; i <ob.length() ; i++) {
            int size=  obj.size();
            for (int j = 0; j < size; j++) {
                ArrayList<String> o = new ArrayList<>(obj.get(j));
                o.add(ob.charAt(i)+"");
                obj.add(o);
            }
        }
        System.out.println(obj+"");
    }
}
