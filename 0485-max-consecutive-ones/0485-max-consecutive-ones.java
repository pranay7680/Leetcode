class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int count=0,a=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                
                if(nums[i]==0)
                {
                    
                    count=0;
                }
                
            }
            if(a<=count)
                {
                    a=count;
                }
         }
        return a;
    }
}