package dsa.oops.Generics;

import java.util.*;


//Static and generics ka ek saath name bhi liya na haath tod kar haath me dedunga
public class Main<T extends Number,p> {
    T var;
    p va;
    int n;
  Main(T name, p var){
      this.var = name;
     va = var;

    }
    // Wildcard Generics
  static  void sum(List<? super Integer> object){
    Integer ans =0;
      for (Object i : object) {
          ans+=(Integer)i;
      }
      System.out.println(ans);
  }
  <C extends Number>  Main(C n){
      this.n = n.intValue();
  }
    void getterT(){
        System.out.println(var);

    }
   void getterP(){
       System.out.println(va);
    }
   public  <k> k function(k key){
      return key;
   }

    public static void main(String[] args) {
//Main<Integer,String> obj = new Main<>(3,"Krishna");
//obj.getterP();
//obj.getterT();
//
//        System.out.println(obj.function(7));
//        Main<Double,Integer> obj1 = new Main<>(3.98523985732f);
//        System.out.println(obj1.n);
       ArrayList<? super Integer> o = new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6));
       sum(o);

    }

}
