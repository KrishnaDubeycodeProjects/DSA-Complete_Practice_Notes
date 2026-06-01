package dsa.oops.mini;

public class Equals {
    static class m{

        Integer d;
        m(){d= null;}
        public int d(){
            return d;
        }

        public boolean equals(Object object){
         if(object instanceof m){
//             int f= d;
             return d.equals((((m) object)).d);
         }
         return false;
        }
    }

    static class n extends m{

        int di;
        n(){super();}
    }
    public static void main(String[] args) {
        m obj1= new m();
        obj1.d= 1;
        m obj2= new m();
        obj2.d= 1;
        Integer o = 2;
        Integer b = 2;
        System.out.println(obj1.equals(obj2));
        System.out.println(o ==b);
        n obj3 =new n();
        obj3.di =1;
//        obj3.d = 1;
        System.out.println(obj1.hashCode());
        System.out.println(obj1.equals(obj3));
        System.out.println(o.hashCode());
        System.out.println(b.hashCode());
        String d= "ig";
        String p="ikg";
        System.out.println(d == p);
    }
}
