class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int left=0;
        int c=0;
        for(int right=0;right<n;right++){
            if(nums[right]!=val){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }else{
                c++;
            }
        }
        return n-c;

    }
}