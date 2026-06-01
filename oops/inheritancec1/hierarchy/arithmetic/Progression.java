package dsa.oops.inheritancec1.hierarchy.arithmetic;

public class Progression {
    protected static long current;
    public Progression(){
        this(0);
    }

    public Progression(long start) {
        current = start;
    }


    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }
    protected  void advance(){
        current++;
    }
    public void printProgression(int n){
       Progression  obj = new Progression();
        System.out.println(nextValue());
        for (int i=1;i<n ; i++){
            System.out.print(" " + nextValue());}
            System.out.println();

    }
}

