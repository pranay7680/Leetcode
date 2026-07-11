class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int el=-1;
        for(int num:nums){
            if(c==0){
                el=num;
                c=1;
            }
            else if(num!=el){
                c--;
            }
            else{
                c++;
            }
        }
        return el;
    }
}