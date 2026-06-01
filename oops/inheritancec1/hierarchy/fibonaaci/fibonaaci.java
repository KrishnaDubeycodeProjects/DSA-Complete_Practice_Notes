package dsa.oops.inheritancec1.hierarchy.fibonaaci;

//constructor

public class fibonaaci {
    int startindex;
    static int[] arr;
    public fibonaaci(int startindex){


        this.startindex = startindex;
    }

    public fibonaaci() {
     this(0);
    }
   private int getans(int num){
        if(num==1){
            return num;
        }
        if(num == 0){
            return num;
        }
        else{
            return getans(num-1)+getans(num-2);
        }
    }
    public void printprogression( int size){
        arr = new int[size];
        for (int i = 0; i < size; i++) {
           arr[i]= getans(i);

        }
        for (int i = startindex; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {


        fibonaaci p = new fibonaaci(2);
        p.printprogression(10);

    }




}
