class Solution {
    public int alternatingSum(int[] nums) {
        int ts=0;
        for(int i=0;i<nums.length;i++){
            ts+=(i%2==0)?nums[i]:-nums[i];
        }
        return ts;
    }
}