class Solution {
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    private boolean startAndEndWithVowel(String s){
        char c1 = s.charAt(0), c2 = s.charAt(s.length()-1);
        return isVowel(c1) && isVowel(c2);
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        //store prefix
        int[] preSum = new int[words.length+1];
        int pre = 0;
        for(int i = 0 ; i < words.length ; i++){
            String curr = words[i];
            if(startAndEndWithVowel(curr))pre++;
            preSum[i+1] = pre;
        }
        //get answer!
        int[] ans = new int[queries.length];
        int idx = 0;
        for(int[] q : queries){
            int s = q[0], e = q[1];
            ans[idx] = preSum[e+1]-preSum[s];
            idx++;
        }
        return ans;
    }
}