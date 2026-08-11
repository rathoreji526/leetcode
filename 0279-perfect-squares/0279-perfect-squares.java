class Solution {
    private int[] dp;
    public int numSquares(int n) {
        dp = new int[n+1];
        return helper(n);
    }
    private int helper(int n){
        if(n==0)return 0;
        if(dp[n]!=0)return dp[n];
        
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i*i <= n ; i++){
            min = Math.min(min, 1 + helper(n-(i*i)));
        }
        
        return dp[n] = min;
    }
}
/*
n = 5
min = max
i = 2
min = 1 + min(min,helper(n-i*i)); //4 return 1 || 1 return 1;
-------------
n = 4
min = max
i = 2
min = 1 + min(min,helper(n-i*i)); //3 return 3; || 0 return 0;
----------------
n = 3
min = max
i = 2
min = 1 + min(min,helper(n-i*i)); //2 return 2;
-----------------
n = 2
min = max
i = 2
min = 1 + min(min,helper(n-i*i)); //1 return 1;
-----------------
n = 1
min = max
i = 2
min = 1 + min(min,helper(n-i*i)); //0 -> 1

*/