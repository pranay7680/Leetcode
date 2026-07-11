class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0,j=0,temp=0;j<nums.length;j++){
            if(nums[j]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
    }
}