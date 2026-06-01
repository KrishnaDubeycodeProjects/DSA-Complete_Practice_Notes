package dsa.oops.dataencapsulation;

public class defaulter {
    //it can be accessed within same package
public static int num;
protected  static String name;
public final float marks;



   public defaulter(int num, String name, float marks) {
       defaulter.num = num;
       this.name = name;
        this.marks = marks;
    }

    public defaulter() {

       this(2,"krishna",56);

    }

@Override
    public String toString() {
        return "defaulter{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


    public static void main(String[] args) {
    defaulter f= new defaulter((short)5,"krishna",(float)67.8);

        System.out.println(defaulter.num);
        System.out.println(f.marks);
        System.out.println(f.name);


    }
}
