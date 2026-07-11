class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxpf=Integer.MIN_VALUE;
        for(int i:prices){
            if(min>i){
                min=i;
            }
            if(maxpf<(i-min)){
                    maxpf=(i-min);
                }
        }
        return maxpf;
    }
}