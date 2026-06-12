package dsa.oops.Algo.LinearSearch;

import java.util.Arrays;

class ps1 {
    public static int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        int[] prefix = new int[n - 1];
if(prefix.length==0){
    return new int[]{0};
}
        // Step 1: Precompute adjacent common prefixes
        for (int i = 0; i < n - 1; i++) {
            prefix[i] = commonPrefix(words[i], words[i + 1]);
        }

        // Step 2: Build prefix max and suffix max arrays
        int[] leftMax = new int[n - 1];
        int[] rightMax = new int[n - 1];
        leftMax[0] = prefix[0];
        for (int i = 1; i < n - 1; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], prefix[i]);
        }
        rightMax[n - 2] = prefix[n - 2];
        for (int i = n - 3; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], prefix[i]);
        }

        // Step 3: Compute result for each index
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int max;
            if (i == 0) {
                if(n-1>1) {
                    max = rightMax[1];
                }
                else if(n-1==0){
                    max = rightMax[0];
                }
                else{
                    max = 0;
                }
            } else if (i == n - 1) {
                if(n-3>=0) {
                    max = leftMax[n - 3];
                }
                else{
                    max = 0;
                }
            } else {
                int left = (i - 2 >= 0) ? leftMax[i - 2] : 0;
                int right = (i + 1 < n - 1) ? rightMax[i + 1] : 0;
                int bridge =0;
                if(i+1!=words.length){
                    bridge  = commonPrefix(words[i-1],words[i+1]);
                }
                max = Math.max(Math.max(left, right), bridge);
            }
            result[i] = max;
        }

        return result;
    }

    static int commonPrefix(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) return i;
        }
        return len;
    }

    public static void main(String[] args) {
        String[] words = {"prince"};
        System.out.println(Arrays.toString(longestCommonPrefix(words)));
    }
}





