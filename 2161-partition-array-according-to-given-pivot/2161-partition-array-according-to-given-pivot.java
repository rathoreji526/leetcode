class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] res = new int[n];

        int smaller = 0, equal = 0, greater = 0;
        for(int num : nums){
            if(num < pivot)smaller++;
            else if(num > pivot)greater++;
            else equal++;
        }
        int si = 0, mi = smaller, ei = mi+equal;

        for(int num : nums){
            if(num < pivot)res[si++] = num;
            else if(num == pivot)res[mi++] = num;
            else res[ei++] = num;
        }

        return res;
    }
}