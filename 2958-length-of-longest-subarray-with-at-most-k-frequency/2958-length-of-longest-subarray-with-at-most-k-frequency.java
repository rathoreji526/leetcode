//sliding window
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0, l = 0, r = 0;

        while(r < nums.length){
            int rc = nums[r++];
            map.put(rc,map.getOrDefault(rc,0)+1);

            while(map.get(rc)>k){
                int lc = nums[l++];
                map.put(lc,map.get(lc)-1);
            }
            ans = Math.max(ans, r-l);
        }
        return ans;
    }
}