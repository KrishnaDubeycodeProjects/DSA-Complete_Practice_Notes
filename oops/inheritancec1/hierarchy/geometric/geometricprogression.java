//GP - 2,4,8,16,24
package dsa.oops.inheritancec1.hierarchy.geometric;

public class geometricprogression {

    long step;
    long initial;
   long multiplier;

    geometricprogression(){
        this(1,1);
    }
    geometricprogression(long step){
        this(step,1);
        this.step= step;
    }
    geometricprogression(long step , long initial){
        this.initial = initial;
        this.step = step;
        multiplier = initial;
    }
    void printvalue(int n){
        System.out.print("( ");
        for (int i = 0; i <n ; i++) {
            long answer = red();
            System.out.print(answer+",");
        }
        System.out.print(" )");
    }

    public long red(){
      multiplier*=step;
      return multiplier;
    }

    public static void main(String[] args) {
        geometricprogression p = new geometricprogression(5);
        p.printvalue(3);
    }

}

