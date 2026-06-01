package dsa.oops.inheritancec1;

public class boxweight extends box{
    int weight;

    public boxweight(int h, int w, int l, int weight) {
        super(h, w, l);
        this.weight = weight;
    }

    public boxweight(int h, int weight) {
        super(h);
        this.weight = weight;
    }

    public static void main(String[] args) {
        boxweight obj = new boxweight(4,5,6,7);
        System.out.println(obj.weight);
        System.out.println(obj.setH(obj.setH(3)));
        System.out.println(obj.s);
        obj.d();
    }
}
