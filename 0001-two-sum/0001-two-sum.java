class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> hm=new HashMap<>(nums.length);
       for(int i=0;i<nums.length;i++){
        Integer idx=hm.get(target-nums[i]);
        if(idx!=null){
            return new int[]{idx,i};
        }
        hm.put(nums[i],i);
       }
        return null;
    }
}