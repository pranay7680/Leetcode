class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int window=0;
        for(int i:nums){
            if(i==1){
                c++;
               window=Math.max(window,c); 
            }
            else{
                c=0;
            }
        }
        return window;
    }
}