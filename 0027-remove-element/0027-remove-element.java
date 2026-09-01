class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)return 0;
        int r = nums.length-1,l = 0;

        while(l < nums.length && l < r){
            if(nums[l]==val){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r--] = temp;
                
            }else l++;
        }

        if(nums[l]==val)return l;
        return l+1;
    }
}