class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int last = 0, secLast = cost[n-1];

        for(int i = n-2 ; i >= 0 ; i--){
            int curr = cost[i] + Math.min(last,secLast);
            last = secLast;
            secLast = curr;
        }

        return Math.min(last,secLast);
    }
}