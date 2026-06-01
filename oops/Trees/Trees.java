package dsa.oops.Trees;
import java.util.Scanner;
public class Trees{
    static   class   Node {
    int data;
        Node left;
        Node right;
        public  Node(int data ){
            this.data = data;
        }
        Node(){}
    }
    private Node obj;
    Trees(){}
    public void populate(Scanner sc) {
            System.out.println("Enter the root data value :");
            int data = sc.nextInt();
            obj = new Node(data);
            populate(sc,obj);
    }
    public void populate(Scanner sc , Node obj){
        System.out.println("Do you want to move inside left of : "+obj.data);
        boolean ex = sc.nextBoolean();
        if(ex){
            System.out.println("Enter the left data value :");
            int data = sc.nextInt();
            obj.left = new Node(data);
            populate(sc , obj.left);
        }
        System.out.println("Do you want to move inside right of : "+obj.data);
        boolean e = sc.nextBoolean();
        if(e){
            System.out.println("Enter the right data value :");
            int data = sc.nextInt();
            obj.right = new Node(data);
            populate(sc , obj.right);
        }
    }
//    public void display(){
//      String b= "\t\t\t";
//        System.out.println(b+obj.data);
//      display(b,obj);
//    }
//   private void display(String b, Node obj){
//        if(obj==null)return;
//       System.out.println(b+obj.data);
//       display(b.substring(1),obj.left);
//       display(b+"\t",obj.right);
//   }
    public void display(Node n , int level){
        if(n==null)return;
        display(n.right , level+1);
        for (int i = 0; i < level ; i++) {
            System.out.print("|\t\t");
        }
        System.out.println("|-->"+n.data);
        display(n.left, level+1);
    }
    public static void main(String[] args) {
        Trees obj = new Trees();
        obj.populate(new Scanner(System.in));
        obj.display(obj.obj,0);
    }
}
