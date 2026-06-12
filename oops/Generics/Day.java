package dsa.oops.Generics;

public enum Day {

    Sunday("Sundaysu",0) , Monday("Mondaysu",1) , Tuesday("Tuesdaysu",2), Wednesday("Wednesdaysu",3),
    Thursday("Thursdaysu",4),Friday("Fridaysu",5),Saturday("Saturdaysu",6);

 private   String name;
 private int num;
 private static int count=0;
    Day(String name,int n){
        this.name = name;
        Day.setter();
        Day.getter();
        this.num = n;
    }
    static void getter(){
        System.out.print(count+" ");
    }

    static void setter(){
        count++;
    }
    @Override
    public String toString(){
        return name+" :"+num;
    }
    public static void main(String[] args) {
        Day obj = Day.Sunday;
        System.out.println(obj);
        System.out.println(math.Multiply.function(4.525f,2.3456f));
    }
}
enum math{
    Add,Minus,Multiply,Divide;
    public <I extends Number> Double function(I a,I b){
        switch(this){
            case Add:
                return a.doubleValue()+b.doubleValue();
            case Minus:
                return a.doubleValue()-b.doubleValue();
            case Multiply:
                return a.doubleValue()*b.doubleValue();
            case Divide:
                return a.doubleValue()/b.doubleValue();
            default:
              return null;

        }
    }
}
