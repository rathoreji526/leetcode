class Solution {
    private char changeCase(char c){
        if((int)c>90) return (char)(c-32);
        return (char)(c+32);
    }
    private boolean isUpperCase(char c){
        return (int)c <= 90;
    }
    public int numberOfSpecialChars(String word) {
        int[] freq = new int[256];
        int[] firstCapitalOcc = new int[26];
        Arrays.fill(firstCapitalOcc,-1);

        boolean[] ansCount = new boolean[26];
        int idx = 0;
        for(char c : word.toCharArray()){
            boolean uc = isUpperCase(c);

            //store first occurence of a letter
            if(uc && firstCapitalOcc[c-'A']==-1)firstCapitalOcc[c-'A'] = idx;

            if(uc && freq[changeCase(c)]>0)ansCount[c-'A'] = true;
            if(!uc && firstCapitalOcc[c-'a'] != -1){
                ansCount[c-'a'] = false;
                freq[c] = -1;
            }
            if(freq[c]!=-1)freq[c]++;
            idx++;
        }
        int ans = 0;
        for(boolean b : ansCount)if(b)ans++;
        return ans;
    }
}
/*
A -> a
a -> A

*/