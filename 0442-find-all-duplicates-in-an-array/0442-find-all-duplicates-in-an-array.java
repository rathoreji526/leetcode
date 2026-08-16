class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] flag = new boolean[nums.length+1];

        for(int num : nums){
            if(flag[num])ans.add(num);
            flag[num] = true;
        }
        return ans;
    }
}