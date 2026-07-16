class Solution {
    private long prfgcd(int[] nums){
        long n[]= new long[nums.length];
        n[0]=nums[0];
        long max=n[0];
        for(int i=1;i<nums.length;i++){
                max=Math.max(max,nums[i]);
            n[i]=GCD(nums[i],max);
        }
        Arrays.sort(n);
        int l=0;
        int r=n.length-1;
        long sum=0;
        while(l<r){
            sum+=GCD(n[l],n[r]);
            l++;
            r--;
        }
        return sum;
    }
    private long GCD(long a,long b){
        while(b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        return prfgcd(nums);
    }
}