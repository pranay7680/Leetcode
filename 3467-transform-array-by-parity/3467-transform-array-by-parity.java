class Solution {
    public int[] transformArray(int[] nums) {
        // int j=0;
        // for(int i=0;i<nums.length;i++){   
        //     if(nums[i]%2==0){
        //         j++;
        //     }
        // }
        // for(int i=0;i<j;i++){
        //     nums[i]=0;
        // }
        // for(int i=j;i<nums.length;i++){
        //     nums[i]=1;
        // }
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==0){
                nums[j]=0;
            }
            else{
                nums[j]=1;
            }
            if(nums[j]==0){
                if(i!=j){
                    int a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
                }
                i++;
            }
        }
        return nums;
    }
}