package dsa.oops.CollectionFrameworks;

public class Main {
    static Main n;
    int no= 4;
    public void fun(){
        System.out.println("ji");
//        return true;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
//        static Main p = new Main(); you can't create the static it should be outside funci;
        System.out.println("hi how ar e you");
        n = new Main();
        System.out.println(n.no);
        System.out.println(Main.n.no);
         Main.n.fun();
         printer.out.println("hi bro");
    }

}
