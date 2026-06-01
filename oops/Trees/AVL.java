package dsa.oops.Trees;

public class AVL {
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
            obj =o;
        }
        else  obj = populate(o,obj);
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

        if((Math.abs(obj.height(obj.left)-obj.height(obj.right)))>1){
            if(obj.height(obj.left)-obj.height(obj.right)>1){
                // LL or LR
                if(obj.height(obj.left.left)<obj.height(obj.left.right)) {
                    obj.right=  left(obj.right);
                }
                return right(obj);
            }
            else{
                if(obj.height(obj.right.left)>obj.height(obj.right.right)) {
                    obj.left=  right(obj.left);
                }
                return left(obj);
            }
        }
        return obj;

    }
    private Node left(Node obj){
      Node o = obj.right;
      Node on = o.left;
      o.left =obj;
      obj.right = on;
      obj.height = Math.max(obj.height(obj.left),obj.height(obj.right))+1;
      o.height = Math.max(obj.height(o.left),obj.height(o.right))+1;
      return o;
    }
    private Node right(Node obj){
        Node o = obj.left;
        Node on = o.right;
        o.right = obj;
        obj.left = on;
        obj.height = Math.max(obj.height(obj.left),obj.height(obj.right))+1;
        o.height = Math.max(obj.height(o.left),obj.height(o.right))+1;
        return o;
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

public boolean AVL(){
     return    AVL(obj);
}
private boolean AVL(Node obj){
        if(obj == null)return true;
        return Math.abs(obj.height(obj.left)-obj.height(obj.right))<=1 && AVL(obj.left) && AVL(obj.right);
}
    public static void main(String[] args) {
        AVL obj = new AVL();
        for (int i = 1; i <=10; i++) {
            obj.populate(i);
        }
        obj.display();
        System.out.println(obj.AVL());
    }
}
