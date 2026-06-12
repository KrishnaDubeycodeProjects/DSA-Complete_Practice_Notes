package dsa.oops.polymorphism.overriding;

import java.util.Arrays;

public class boxmodify extends box {

  boxmodify(int s){
      super.s = s;
      obj[0]= 3;
  }

    @Override
    int num(int p){
        return p*4;
    }

    public static void main(String[] args) {
        box obj = new boxmodify(4);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(Arrays.toString(obj.obj));
    }
}
