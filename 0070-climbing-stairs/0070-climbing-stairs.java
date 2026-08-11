class Solution {
    public int climbStairs(int n) {
        if(n==1)return 1;
        int last = 1, secLast = 1;

        for(int i = n-2 ; i>=1 ; i--){
            int temp = secLast;
            secLast = secLast+last;
            last = temp;
        }
        return last+secLast;
    }
}