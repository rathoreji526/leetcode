class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        int exp = freq[s.charAt(0)-'a'];
        for(int count : freq){
            if(count==0)continue;
            
            if(exp!=count)return false;
        }
        return true;
    }
}