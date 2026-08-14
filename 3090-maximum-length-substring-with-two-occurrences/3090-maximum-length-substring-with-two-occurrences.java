class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int l = 0, r = 0, ans = 0;

        while(r < s.length()){
            char rc = s.charAt(r++);
            freq[rc-'a']++;

            while(freq[rc-'a']>2){
                char lc = s.charAt(l++);
                freq[lc-'a']--;
            }
            ans = Math.max(ans, r-l);
        }
        return ans;
    }
}