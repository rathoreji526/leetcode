class Solution {
    private boolean isUpperCase(char c){
        return (int)c <= 90;
    }
    public int numberOfSpecialChars(String word) {
        int[] upperCaseFirstIdx = new int[26];
        int[] lowerCaseLastIdx = new int[26];
        Arrays.fill(upperCaseFirstIdx,-1);
        Arrays.fill(lowerCaseLastIdx,-1);

        //tracking:-
        //     - first index of uppercase
        //     - last index of lowercase
        int idx = 0;
        for(char c : word.toCharArray()){
            if(isUpperCase(c)){
                if(upperCaseFirstIdx[c-'A']==-1)upperCaseFirstIdx[c-'A'] = idx;
            }else{
                lowerCaseLastIdx[c-'a'] = idx;
            }
            idx++;
        }

        int ans = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(upperCaseFirstIdx[i]==-1 || lowerCaseLastIdx[i]==-1)continue;
            if(upperCaseFirstIdx[i]==-1 && lowerCaseLastIdx[i]==-1)continue;

            if(upperCaseFirstIdx[i] > lowerCaseLastIdx[i])ans++;
        }
        return ans;
    }
}
/*
Task---
har wo element count karna hai jo uppercase aur lowercase dono me ho!
make sure ki uppercase ke bad lowercase na ho!

ek kaam kar sakte hai har char ke uppercase ka first index track kar sakte hai aur har case ke lowercase ka last idx note kar sakte hai

*/