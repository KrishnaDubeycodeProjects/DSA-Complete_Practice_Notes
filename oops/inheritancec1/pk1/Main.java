package dsa.oops.inheritancec1.pk1;
import dsa.oops.inheritancec1.pk2.SubMain;

public class Main {

    Main(){
    }
  //   protected static void inc(){}
    public static void main(String[] args) {
        Main obj = new Main();
       SubMain o = new SubMain();
       SubMain.inc();
        SubMain.inc();
        System.out.println(SubMain.s);

    }
}
