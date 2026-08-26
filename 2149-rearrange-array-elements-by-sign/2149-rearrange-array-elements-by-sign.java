class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];

        int even = 0,odd = 1;
        for(int num : nums){
            if(num > 0){
                result[even] = num;
                even+=2;
            }else{
                result[odd] = num;
                odd+=2;
            }
        }
        return result;
    }
}