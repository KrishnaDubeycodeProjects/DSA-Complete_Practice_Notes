package dsa.oops.inheritancec1;

public class box {
    int l,w;

    private int h;
    static box s;
    public box(int h, int w, int l) {
        this.h = h;
        this.w = w;
        this.l = l;

    }


    public box(int h) {
        this.h = h;
    }

    public box(int l, int h) {
        this.l = l;
        this.h = h;
    }
    public static int setH(int h) {
        return h;
    }
    final void d(){}
}
