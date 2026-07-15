class Solution {
    public int[] concatWithReverse(int[] nums) {
        int newArr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            newArr[i]=nums[i];
            newArr[nums.length+i]=nums[nums.length-i-1];
        }
        return newArr;
    }
}