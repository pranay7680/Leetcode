class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1,mc=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                c++;
            }
           else if(nums[i]==nums[i+1]){
                continue;
            }
                else{
                c=1;
            }
            if(mc<c){
                    mc=c;
                }
        }
        return mc;
    }
}