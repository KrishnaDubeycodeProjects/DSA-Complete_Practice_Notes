package dsa.oops.Recursion.Printing;

public class Main {
    public static void main(String[] args) {
        trangle(4,0);
        trangle_Rev(4,0);
    }
  static  void trangle(int r , int c){
        if(r==0)return;
        if(c<r){
            System.out.print("* ");
            trangle(r,c+1);
        }
        else {
            System.out.println();
            trangle(r - 1, 0);
        }
    }

    static  void trangle_Rev(int r , int c){
        if(r==0)return;
        if(c<r){
            trangle_Rev(r,c+1);
            System.out.print("* ");

        }
        else{
            trangle_Rev(r-1,0);
            System.out.println();

        }
    }
}
