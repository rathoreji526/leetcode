class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] flag = new boolean[101];
        for(int num : nums){
            if(num%k==0)flag[num/k] = true;
        }
        for(int i = 1 ; i < 101 ; i++){
            if(!flag[i])return i*k;
        }
        return 101*k;
    }
}