package dsa.oops.interfaces.Observer;

public class Main {
    Main(){

    }

    public static void main(String[] args) {
        obs obj = new obs(56);
        obserer ojb =new obserer(55);
        obj.addObserver(ojb);
       obj.s= obj.setMethod(3);
        System.out.println(obj.s);
    }
}
