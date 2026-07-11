class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(left==right && nums[mid]!=target){
                break;
            }
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(nums[left]>target){
            return left;
        }
        return left+1;
    }
}