package dsa.oops.inheritancec1.hierarchy.arithmetic;

public class ArithmeticProgression extends Progression{
    protected static long increment;
    public ArithmeticProgression(){
        this(1,0);
    }
    public ArithmeticProgression(long stepsize){
        this(stepsize,0);
    }
    public ArithmeticProgression(long stepsize , long start){
        super(start);
        increment = stepsize;
    }
    @Override
    protected  void advance(){
        current +=increment;
    }

    public static void main(String[] args) {
        ArithmeticProgression prog ;
        prog = new ArithmeticProgression(5,3);
        prog.printProgression(10);

    }
}
