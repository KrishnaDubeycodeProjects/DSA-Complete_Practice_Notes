package dsa.oops.Algo;

class ps2 {

    public static int longestSubsequence(String s, int k) {
        int end = s.length()-1;
        int multiplier =1;
        int result =0;
        int count =0;
        for(int i = end ; i>=0 ; i--){
            if(s.charAt(i)=='1'){
                if((multiplier<=k && (result+multiplier)<=k)){
                    count++;
                    result+=multiplier;
                }
            }
            else{
                count++;
            }
            if(i<0){
                return count;
            }
            if(multiplier<=k) {
                multiplier *= 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String name = "111100010000011101001110001111000000001011101111111110111000011111011000010101110100110110001111001001011001010011010000011111101001101000000101101001110110000111101011000101";

        System.out.println(longestSubsequence(name, 11713332));
    }

}
