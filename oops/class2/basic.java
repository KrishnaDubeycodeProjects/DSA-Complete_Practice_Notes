package dsa.oops.class2;

public class basic {
   static int str;
    String name;
  static  float marks;
  static class inner_basic{
     static int inner_str;
      void inner_str(){
          System.out.println("you are in inner basic ");
      }
      inner_basic(int no){
          inner_basic.inner_str = no;
      }

     static class grand_inner_basic {
         static int grand_inner_str;

          public grand_inner_basic(int grand_inner_str) {
              grand_inner_basic.grand_inner_str = grand_inner_str;
          }


          void inner_str() {
              System.out.println("you are in inner basic ");
          }
      }

  }
    basic(int str,String name ,double marks){
        this.name = name;
        basic.str = str;
      basic.marks = (float)marks;
    }


    public static void main(String[] args) {
        System.out.println("hi");
        basic n = new basic(3,"krishna",56.13);

        System.out.println(n.name);
        System.out.println(basic.marks);
        System.out.println(basic.str);
        System.out.println(inner_basic.grand_inner_basic.grand_inner_str);

    }


}
