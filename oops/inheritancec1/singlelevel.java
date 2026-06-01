package dsa.oops.inheritancec1;

public class singlelevel {
    int lengt;
    singlelevel(int lengt){
        this.lengt = 2*lengt;
        System.out.println("you are in singlelevel constructor");
    }

    public static void main(String[] args) {

        grand o= new grand(3,4);
        System.out.println(o.lengt);
        System.out.println(o.height);
    }


}
class child extends singlelevel{

    child(int l){

        super(l);
        System.out.println("hi you are in child constructor"+this.lengt);

    }
}
class grand extends child{
    int height;
    grand(int height,int length){

        super(length);
        this.height = 5*height;
        System.out.println("hi you are in grand constructor"+this.height+" "+this.lengt);
    }
}