//- - - - - - - - - -  optimal solution  - - - - - - - - - -
class Solution {
    private void reverse(int[] nums , int si , int ei){
        while(si<=ei){
            int temp = nums[si];
            nums[si++] = nums[ei];
            nums[ei--] = temp;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if(k==0)return;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
}
/**
[1,2,3,4,5,6,7] k = 3 , n = 7
3 2 1 4 5 6 7
3 2 1 7 6 5 4
4 5 6 7 1 2 3

--------------
0 -> n-k
n-k -> n-1
0->n-1

4 3 2 1 5 6 7
4 3 2 1 7 6 5
5 6 7 1 2 3 4
 */