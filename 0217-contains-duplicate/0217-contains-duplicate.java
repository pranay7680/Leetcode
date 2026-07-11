class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> m=new HashSet<>();
        for(int i:nums){
            if(m.contains(i)){
                return true;
            }
            m.add(i);
        }
        return false;
    }
}