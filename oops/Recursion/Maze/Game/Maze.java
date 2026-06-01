package dsa.oops.Recursion.Maze.Game;

public class Maze {
    public static void main(String[] args) {
        // Left and up move is allowed
//        path("",3,3,1,1);
//        ArrayList<String> obj =pat("",3,3,1,1);
//        System.out.println(obj+"");
//        ArrayList<String> ob =paths("",3,3,1,1);
//        System.out.println(ob+"");
//        ArrayList<String> obj =  pathdig("",3,3,1,0);
//        System.out.println(obj+"");
    }


    // 1,1 is destiny and <= to it are src
//   static int ways_maze(int r , int c){
//        if(r==1 || c==1){
//            return 1;
//        }
//        int way1 = ways_maze(r,c-1);
//        int way2 = ways_maze(r-1,c);
//        return way1+way2;
//    }


    // ALL blocks can consider a src and destiny
//static int ways_maze(int r , int c,int target_r , int target_c){
//        if(r<target_r || c<target_c)return 0;
//    if(r==target_r || c==target_c){
//        return 1;
//    }
//    int way1 = ways_maze(r,c-1,target_r,target_c);
//    int way2 = ways_maze(r-1,c,target_r,target_c);
//    return way1+way2;
//}


//    path without diagonal
//static void path(String s , int r , int c , int target_r , int target_c){
//    if(r<target_r || c<target_c)return;
//    if(r==target_r && c==target_c){
//        System.out.println(s);
//    }
//   if(c>target_c) path(s+" --> L", r,c-1,target_r,target_c);
//   if(r>target_r) path(s+" --> U",r-1,c,target_r,target_c);
//}

// Path containing diagonal as well
//    static void pathDig(String s , int r , int c , int target_r , int target_c){
//        if(r<target_r || c<target_c)return;
//        if(r==target_r && c==target_c){
//            System.out.println(s);
//        }
//        if(c>target_c) path(s+" --> R", r,c-1,target_r,target_c);
//        if(r>target_r) path(s+" --> D",r-1,c,target_r,target_c);
//        pathDig(s+" -->Dig",r-1,c-1,target_r,target_c);
//    }
//     List of row to target
// static ArrayList<String> pat(String s, int r, int c, int target_r , int target_c){
//        ArrayList<String> obj = new ArrayList<>();
//        if(r==target_r && c== target_c){
//         obj.add(s);
//         return obj;
//        }
//        ArrayList<String> o = new ArrayList<>();
//        if(c>target_c){
//         obj = pat(s+"R",r,c-1,target_r,target_c);
//        }
//        if(r>target_r){
//          o=  pat(s+"D",r-1,c,target_r,target_c);
//        }
//
//        o.addAll(obj);
//        obj.clear();
//     for (int i = o.size()-1; i >=0; i--) {
//         obj.add(o.get(i));
//     }
//        return obj;
//}
//    static ArrayList<String> paths(java.lang.String s, int r, int c, int target_r , int target_c){
//        ArrayList<java.lang.String> obj = new ArrayList<>();
//        if(r==target_r && c== target_c){
//            obj.add(s);
//            return obj;
//        }
//        ArrayList<java.lang.String> o = new ArrayList<>();
//        if(c>target_c){
//            obj = paths(s+"R",r,c-1,target_r,target_c);
//        }
//        if(r>target_r){
//            o=  paths(s+"D",r-1,c,target_r,target_c);
//        }
//
//        obj.addAll(o);
//        return obj;
//    }



//    static ArrayList<String> pathdig(java.lang.String s, int r, int c, int target_r , int target_c){
//        ArrayList<java.lang.String> obj = new ArrayList<>();
//        if(r<target_r || c<target_c){
//            return new ArrayList<>();
//        }
//        if(r==target_r && c== target_c){
//            obj.add(s);
//            return obj;
//        }
//        ArrayList<java.lang.String> o = new ArrayList<>();
//        if(c>target_c){
//            obj = pathdig(s+"R",r,c-1,target_r,target_c);
//        }
//        if(r>target_r){
//            o=  pathdig(s+"D",r-1,c,target_r,target_c);
//        }
//        obj.addAll(o);
//        obj.addAll(pathdig(s+"Diagonal",r-1,c-1,target_r,target_c));
//
//
//        return obj;
//    }
}
