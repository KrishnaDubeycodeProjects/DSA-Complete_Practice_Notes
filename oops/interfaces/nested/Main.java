package dsa.oops.interfaces.nested;

public class Main  implements A.b{

    int s;

    public Main() {
        this(0);
    }

    Main(int s){
        this.s = s;
    }

    @Override
    public void m() {
        System.out.println("your name");
    }

    @Override
    public void setNum(int s) {
        this.s = s;

    }

    @Override
    public int getNum() {
        return s;
    }

    public static void main(String[] args) {
        Main Object = new Main();
        Object.setNum(100);
        System.out.println(Object.getNum());

    }
}
