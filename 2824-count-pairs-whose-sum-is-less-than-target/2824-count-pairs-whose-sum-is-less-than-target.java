class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int l=0,r=nums.size()-1,count=0;
        int [] arr=new int[nums.size()];
        int a=0;
        for(int i:nums){
            arr[a++]=i;
        }
        Arrays.sort(arr);
        while(l<r){
            if(arr[l]+arr[r]<target){
                count+=r-l;
                l++;
            }else{
                r--;
            }    
        }
        return count;
    }
}