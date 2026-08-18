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
/*
digit -> uniqueness -> order 

zero    -> 'z' unique -> 1
one     -> 'o' unique when we have already removed two,four,zero -> 9
two     -> 'w' unique -> 2 
three   -> 'r' unique when we have already removed four -> 8
four    -> 'u' unique -> 3
five    -> 'f' unique when we have already removed four -> 6
six     -> 'x' unique -> 4 
seven   -> 'v' unique when we have already removed five -> 7
eight   -> 'g' unique -> 5
nine    -> 'i' unique when we have alerady removed six,eight -> 10

 */