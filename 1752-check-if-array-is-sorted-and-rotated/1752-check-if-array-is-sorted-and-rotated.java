class Solution {
    public boolean check(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                res++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            res++;
        }
        return res<=1;
    }
}