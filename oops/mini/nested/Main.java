package dsa.oops.mini.nested;
//.. Inner class mast cheez
public class Main {
    static int f;

    class n{
        static int f;
      static  void d(){
            Main.f = 55;
        }
    }
    static void f(){
        System.out.println(n.f=5);}

    void d(){
        n.d();
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.d();
        System.out.println(Main.n.f);
      Main.f();
    }
}

class ab{
    static int x;
   static int y;
   int f;
 class s{
       int f =5;
       void d(){
           ab ab = new ab();
       //    System.out.println(ab.f);
           System.out.println(ab.this.f);
           System.out.println(this.f);
       }
   }
    ab(){x=3;}
    public static void main(String[] args) {
     for(int i =0 ; i<4; i++){
         class s{
             int f;
            static boolean d;
         }
         class a extends s{

         }

       // s s =new s();
         System.out.println(new s().f+" "+s.d);
     }
        System.out.println(x);
        ab.s s =new ab().new s();
    }
}