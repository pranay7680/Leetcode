class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] =new int[nums.length];
        int a=0,b=1;
        for(int i:nums){
            if(i>0){
                arr[a]=i;
                a+=2;
            }else{
                arr[b]=i;
                b+=2;
            }
        }
        return arr;
    }
}