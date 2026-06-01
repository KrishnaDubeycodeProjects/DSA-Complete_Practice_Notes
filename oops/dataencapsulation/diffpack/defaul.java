package dsa.oops.dataencapsulation.diffpack;

import dsa.oops.dataencapsulation.defaulter;
public class defaul extends defaulter {


public static int num=6;
public static String name;
defaul(){
 super();
}
private void fun(){
    System.out.println("hi bro");
    defaulter d = new defaulter();



}



    public static void main(String[] args) {

        defaulter d = new defaul();


        defaul p = new defaul();

        defaul.name = "krrr";
        defaulter.name="krisha"; //  since, name is protected but static
        d.name = "f";
        System.out.println(defaul.name);
//        d.toString();
//        d.name = "4";

        defaulter.num = 4;

        System.out.println(defaul.num);
        System.out.println(defaul.name);
        System.out.println(defaulter.name);
        System.out.println(defaulter.num);
        System.out.println(d.marks);

    }


}
