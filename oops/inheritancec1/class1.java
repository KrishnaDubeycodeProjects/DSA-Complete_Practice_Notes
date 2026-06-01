package dsa.oops.inheritancec1;

 public class class1 {
    int f,g,j;

    public static void main(String[] args) {
    inner_class1 c=   inner_class1.getInstance() ;
      c.f= 3;
        System.out.println(c.f);
        System.out.println(c.s);
    }
}
 class inner_class1 extends class1{
    int s;

private inner_class1(int s){
        super();
        this.s = s;
    }
public static inner_class1 p;
  protected static inner_class1 getInstance(){
   p = new inner_class1(4);
    return p;
    }

}



