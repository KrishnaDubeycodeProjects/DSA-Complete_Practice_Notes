package dsa.oops.Algo.LinearSearch;

class rev {
    static int ans =0;
    public static int reverse(int x) {
        while(x!=0){
            if(ans<=Integer.MIN_VALUE/10 || (ans)>=Integer.MAX_VALUE/10){
                return 0;
            }
            ans=ans*10+x%10;

            x/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1999000009));
    }
}
