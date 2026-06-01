package dsa.oops.class1;
// code for garbage collector of objects of ref. variables and immutable wrapper class
public class basic {


    public static void main(String[] args) {
        System.out.println("hi world");

        grabge a;
        for(int i=0 ; i<1000000000 ; i++){
        a= new grabge(i);
            System.out.println(i);
        }

    //lets create a grabage collector


    }

    @Override
    protected void finalize() throws Throwable {
        int a =0;

        System.out.println(a+ " :-> executed");
    }
}
 class grabge{
    int number;
   public grabge(){

    }
    public grabge(int n){
       this.number = n;
    }


}
