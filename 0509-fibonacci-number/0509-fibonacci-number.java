class Solution {
    public int fib(int n){
        if(n==0)return 0;
        int prev = 1, prevPrev = 0;
        for(int i = 2 ; i < n ; i++){
            int curr = prev+prevPrev;
            prevPrev = prev;
            prev = curr;
        }
        return prev+prevPrev;
    }
}
/**
----------recursive way-----------
private int[] dp;
    private int helper(int n){
        if(n<=1)return n;
        if(dp[n]!=0)return dp[n];

        int ans = helper(n-1) + helper(n-2);
        
        return dp[n] = ans;
    }
    public int fib(int n) {
        dp = new int[n+1];
        return helper(n);
    }
 */