class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] result = new int[nums1.length+nums2.length][2];
        int i = 0, j = 0, idx = 0;

        //merge
        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                result[idx][0] = nums1[i][0];
                result[idx][1] = nums1[i++][1] + nums2[j++][1];
            }else if(nums1[i][0] < nums2[j][0]){
                result[idx][0] = nums1[i][0];
                result[idx][1] = nums1[i++][1];
            }else{
                result[idx][0] = nums2[j][0];
                result[idx][1] = nums2[j++][1];
            }
            idx++;
        }
        while(i < nums1.length){
            result[idx][0] = nums1[i][0];
            result[idx][1] = nums1[i++][1];
            idx++;
        }
        while(j < nums2.length){
            result[idx][0] = nums2[j][0];
            result[idx][1] = nums2[j++][1];
            idx++;
        }
        //return the result till idx
        return Arrays.copyOf(result,idx);
    }
}