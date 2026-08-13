class Solution {
    private int[] dp;
    private int n;

    private int helper(char[] str, int i){
        if(i>=n)return 1;
        if(dp[i]!=-1)return dp[i]; 

        if(str[i]-'0'==0)return 0;
        int singleTake = helper(str, i+1);
        int doubleTake = i<=n-2 && ((str[i]-'0') * 10 + str[i+1]-'0')<=26 ? helper(str, i+2) : 0;
        int ans = singleTake + doubleTake;

        return dp[i] = ans;
    }

    public int numDecodings(String s) {
        n = s.length();
        dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(s.toCharArray(), 0);
    }
}