class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        //calculate left sum
        int preSum = 0;
        for(int i = 1 ; i < n ; i++)preSum += nums[i-1];

        //iterate from right->left and store the answer
        int[] ans = new int[n];
        int postSum = 0;
        for(int i = n-1 ; i >= 1 ; i--){
            
            int sub = preSum-postSum;
            sub = sub < 0 ? -sub : sub;

            preSum -= nums[i-1];
            postSum += nums[i];
            ans[i] = sub;
        }
        ans[0] = Math.max(preSum-postSum,-(preSum-postSum));
        
        //return answer
        return ans;
    }
}
/**
[10,4,8,3]
22 
0


 */