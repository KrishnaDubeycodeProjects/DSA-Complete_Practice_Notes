package dsa.oops.abstraction;

public class abs2 extends abs1{

    int s;
    abs2(int s){
        this.s = s;
    }
    @Override
    public void execute(){
        System.out.println("hi bro how are you");
    }
    @Override
    public int num(int k){
        return k + 56;
    }

    public static void main(String[] args) {
        abs1 ab = new abs2(4);

        System.out.println(ab.s);

        ab.nm();
    }


}
