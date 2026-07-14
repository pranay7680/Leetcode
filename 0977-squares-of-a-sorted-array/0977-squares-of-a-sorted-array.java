class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int n=r;
        int[] newArr = new int[r+1];
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                newArr[n] = nums[l] * nums[l];
                l++;
            }else{
                newArr[n]=nums[r]*nums[r];
                r--;
            }
                n--;
        }
        return newArr;
    }
}