class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0 , j = 0;
        while(i < nums.length){
            int curr = nums[i];
            if(curr%2==0){
                int temp = curr;
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return nums;
    }
}