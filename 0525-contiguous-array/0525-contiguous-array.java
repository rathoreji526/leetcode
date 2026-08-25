class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int preSum = 0, ans = 0;

        for(int i = 0 ; i < nums.length ; i++){
            //calculate presum
            int num = nums[i];
            preSum += num==0 ? -1 : 1;

            //if complete sum is equal to zero 
            if(preSum == 0)ans = i+1;

            //if map contains the presum calculate the answer else store the answer, dont overwrite 
            Integer prevIdx = map.get(preSum);
            if(prevIdx!=null){
                ans = Math.max(ans, i-prevIdx);
            }
            else{
                map.put(preSum,i);
            }
            
        }
        return ans;
    }
}