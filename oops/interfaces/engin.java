package dsa.oops.interfaces;

public interface engin extends engine, mediaplayer , brake{
   @Override
    void brake();
    void start();
    static void n(){
        System.out.println("You are in engin.n");
    }
    int acc(int m);
}
