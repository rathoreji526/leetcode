class Solution {
    private int s;
    private int[] dp;
    private int helper(int i){
        if(i>=s)return 1;
        if(dp[i]!=0)return dp[i];

        int ans = helper(i+1) + helper(i+2);
        dp[i] = ans;
        
        return ans;
    }
    public int climbStairs(int n) {
        s = n;
        dp = new int[n];
        return helper(1);
    }
}