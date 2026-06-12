package dsa.oops.class3singleton;

public class basic {
  private  basic(){

    }
  public static basic instance;
 public static basic getInstance(){

      if(instance==null){
          System.out.println("number of times instance created");
          instance = new basic();
      }
      return instance;
  }


}
