package dsa.oops.interfaces;

import java.util.Scanner;

public class petrol implements engine, brake , mediaplayer ,engin{
    @Override
    public  void start(){
        System.out.println("petrol engine is started");
    }
    @Override
    public void stop(){
        System.out.println("petrol engine is stopped!!");
    }
    public int acc(int num){
        System.out.println("petrol engine is accelerated by:" + num + "kmph");

        return num;
    }

    @Override
    public void brake(){
        System.out.println("instant brake has been occurred any tension!!");
    }
    @Override
  public int skip(int num){
        System.out.println();
        return num;
    }
 

    public static void main(String[] args) {
        System.out.println(petrol.mai);
        petrol car = new petrol();
        car.start();

        int num ;
        System.out.println("Enter to increase the speed of the car : ");
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
       int check =  car.acc(num);

        if(check>100){

            car.brake();
        }
        car.stop();
        System.out.println(petrol.s);
        System.out.println(brake.s);
        System.out.println(petrol.var);

    }


}
