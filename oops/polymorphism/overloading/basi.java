package dsa.oops.polymorphism.overloading;

public class basi {
    int n,m;
    String name;
    double p;
    basi(int n, int m){
        this.n = n;
        this.m = m;


    }
    basi(double o , int m){
        this.p = o;
        this.m = m;
    }

    public static void main(String[] args) {
        basi n = new basi(4,5);
        basi m = new basi(5.7,6);
        System.out.println(m.p);
        System.out.println(n.p);
    }
}
