package dsa.oops.Recursion.Maze.Obstacle;

public class Main {
    public static void main(String[] args) {
//        System.out.println(ret_path22(0,0,3,1,0,1));

        boolean[][] path = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        ret_path_print("",0,0,path);
    }
//    static  int ret_path22(int r, int c,int tr,int tc, int or,int oc){
//        if(r==tr && c==tc)return 1;
//        if((r==or && c==oc) || (r>tr || c>tc))return 0;
//        int show1 = ret_path22(r+1,c,tr,tc,or,oc);
//        int show2 = ret_path22(r,c+1,tr,tc,or,oc);
//        return show2+show1;
//    }

    static void ret_path_print(String s , int r ,int c ,boolean[][] path){
        if(r==path.length-1 && c==path[0].length-1){
            System.out.print(s+" ");
            return;
        }
        if(!path[r][c])return;
        if(r<path.length-1){
            ret_path_print(s+"D",r+1,c,path);
        }
        if(c<path[0].length-1)ret_path_print(s+"R",r,c+1,path);
    }


}
