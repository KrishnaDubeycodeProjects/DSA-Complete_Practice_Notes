package dsa.oops.Trees;

public class BinarySearchTrees {
    static class Node{
        Node left ;
        Node right;
        int height;
        int data;
        Node(int d){
            data = d;
        }
        public int height(Node obj){
            if(obj == null)return 0;
            else {
                return obj.height;
            }
        }
    }
    private Node obj ;
   public void populate(int data){
       Node o = new Node(data);
       if(obj==null){
           obj = new Node(data);
       }
      else  populate(o,obj);
   }

   private Node populate(Node o,Node obj){
        if(obj==null) {
         obj =o;
         return obj;
        }
        if(o.data<obj.data){
      obj.left = populate(o,obj.left);
        }
      else if(o.data>obj.data)obj.right= populate(o,obj.right);
      obj.height = Math.max(obj.height(obj.left),obj.height(obj.right))+1;
       return obj;
   }
   public  void display(){
        if(obj == null) return;
        display(obj , "Root Node: ");
   }
   private void display(Node obj,String n){
        if(obj ==null)return;
        display(obj.right , "Right Node of "+obj.data+" : ");
       System.out.println(n+obj.data+": "+obj.height);
       display(obj.left,"Left Node of "+obj.data+" : ");
   }


   public  void delete(int key){
       delete(key,obj);
   }

   private void delete(int key , Node obj){
       if(obj.data==key) {
           transit(obj);
           return;
       }
    if(key>obj.data){
        delete(key,obj.right);
    }
    else delete(key,obj.left);
   }
   private void transit(Node obj){
       while(obj.left.left!=null){
           obj.data = obj.left.data;
           obj= obj.left;
       }
       obj.data = obj.left.data;
       obj.left = null;
   }


    public static void main(String[] args) {
    BinarySearchTrees obj = new BinarySearchTrees();
    obj.populate(2);
    obj.populate(34);
    obj.populate(29);
    obj.populate(50);
    obj.display();
    obj.delete(34);

    obj.display();
    }
}
