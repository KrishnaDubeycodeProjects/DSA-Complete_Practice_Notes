package dsa.oops.Algo.LinearSearch;

public class charSearch {
    public static char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int start=0,end=letters.length-1,mid;
        int targ = target- 97;
        if(targ <letters[end]-97){
            while(start<=end){
                mid = start + (end-start)/2;
                if(targ >=( letters[mid]-97)){

                        for(int i = mid ; i<letters.length ; i++){
                            boolean st =false;
                            if(target - 97<(letters[i] - 97 )){
                                st = true;
                            }
                           if(st){
                               ans = letters[i];
                               break;
                           }
                        }
                        return ans;
                }
                else if(targ<( letters[mid]-97)){
                    end =mid-1;
                }
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'e','e','e','k','q','q','q','v','v','y'};
        System.out.println(nextGreatestLetter(letters, 'k'));
    }
}
