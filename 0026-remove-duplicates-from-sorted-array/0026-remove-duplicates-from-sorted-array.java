class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0;
        while(r < nums.length){
            int curr = nums[r];
            while(r < nums.length && nums[r]==curr)r++;
            nums[l++] = curr;
        }
        return l;
    }
}