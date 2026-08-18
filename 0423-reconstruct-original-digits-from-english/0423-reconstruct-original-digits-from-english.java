class Solution {
    public String originalDigits(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray())freq[c-'a']++;

        int[] digits = new int[10];

        //unique digits
        digits[0] = freq['z'-'a'];
        digits[2] = freq['w'-'a'];
        digits[4] = freq['u'-'a'];
        digits[6] = freq['x'-'a'];
        digits[8] = freq['g'-'a'];
        
        //other digits
        digits[5] = freq['f'-'a'] - digits[4];
        digits[7] = freq['v'-'a'] - digits[5];
        digits[3] = freq['h'-'a'] - digits[8];
        digits[1] = freq['o'-'a'] - digits[0] - digits[2] - digits[4];
        digits[9] = freq['i'-'a'] - digits[5] - digits[6] - digits[8];

        //build answer
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 10 ; i++){
            for(int j = 1 ; j <= digits[i] ; j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}