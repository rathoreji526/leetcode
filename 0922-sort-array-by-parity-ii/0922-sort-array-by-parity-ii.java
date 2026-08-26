class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ei = 0, oi = 1 , n = nums.length;
        while(ei < n && oi < n){
            while(ei < n && nums[ei]%2==0)ei+=2;
            while(oi < n && nums[oi]%2==1)oi+=2;

            if(ei < n && oi < n){
                int temp = nums[ei];
                nums[ei] = nums[oi];
                nums[oi] = temp;
            }
        }
        return nums;
    }
}