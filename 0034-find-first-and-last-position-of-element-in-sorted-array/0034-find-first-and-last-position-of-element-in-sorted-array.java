class Solution {
    public static int leftroo(int [] nums,int target){
        int left=0,right=nums.length-1,res=-1;      
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res=mid;
                    right=mid-1;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
     public static int rightroo(int [ ]nums,int target){
        int left=0,right=nums.length-1,res=-1;      
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res=mid;
                left=mid+1;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr []={-1,-1};
        arr[0]=leftroo(nums,target);
        arr[1]=rightroo(nums,target);
        return arr;
    }
}