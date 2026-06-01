package dsa.oops.Algo.college.string;

public class Main {

    public static void boyerMoore(String txt , String pat){
        int[] freq = new int[26];
        for (int i = 0; i < pat.length() ; i++) {
            freq[pat.charAt(i)-'a']= i;
        }
        int i =0;
        int j = pat.length()-1;
        while(i<=(txt.length()-pat.length())){
            int s =0;
            while(j>=0 && txt.charAt(i+s)==pat.charAt(j)) {
                j--;
                s++;
            }
            if(j<0){
                System.out.println("Match at : "+i);
                i+=pat.length();
                j = pat.length()-1;
            }else{
                if(i+s<=freq[txt.charAt(i+s)-'a']){
                    i++;
                    j=pat.length()-1;
                }else{
             i+=  Math.max(1,freq[txt.charAt(i+s)-'a']);
                }
            }
        }
    }
    public static void main(String[] args) {
boyerMoore("abcbabc","bc");
    }
}
