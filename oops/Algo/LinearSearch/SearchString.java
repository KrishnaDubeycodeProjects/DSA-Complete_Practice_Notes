package dsa.oops.Algo.LinearSearch;
//Make sure arr length is an variable and string length is an function
public class SearchString {
    static boolean LinearSearch(String word , char target){
        for (int i = 0; i <word.length() ; i++) {
           if(word.charAt(i) == target){
               return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(LinearSearch("Krishna" , 'r'));
    }

}
