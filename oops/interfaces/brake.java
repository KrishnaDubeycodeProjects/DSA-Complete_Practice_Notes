package dsa.oops.interfaces;

public interface brake extends engine, mediaplayer{

     void brake(); // class se hi interface banana hai toh iske object to restrict karna hoga therefore
    // constructor is restricted and methods are allowed to be implemented accross different class
    // toh isme sabko implement karana hai

    @Override
    void start();
    int var = 4;
    default void noob(){
        System.out.println("yo yo");
    }
    int s = 5;

    static int function(int n){
        return n;
    }
     static void main(String[] args) {
        System.out.println("hi hi");
        System.out.println(brake.s);
         System.out.println(function(s));

    }

}

