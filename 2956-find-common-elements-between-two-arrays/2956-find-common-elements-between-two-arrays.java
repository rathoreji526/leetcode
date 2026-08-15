class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] arr1 = new boolean[101], arr2 = new boolean[101];

        for(int num : nums2)arr2[num] = true;
        int ans1 = 0, ans2 = 0;

        for(int num : nums1){
            if(arr2[num])ans1++;
            arr1[num] = true;
        }
        for(int num : nums2){
            if(arr1[num])ans2++;
        }

        return new int[]{ans1,ans2};
    }
}