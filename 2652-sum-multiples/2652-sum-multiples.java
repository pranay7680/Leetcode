class Solution {
    public int sumOfMultiples(int n) {
        int tc=n/3;
        int fc=n/5;
        int sc=n/7;
        int ofc=n/15;
        int toc=n/21;
        int tfc=n/35;
        int ozfc=n/105;
        int ts=3*tc*(tc+1)/2;
        int fs=5*fc*(fc+1)/2;
        int ss=7*sc*(sc+1)/2;
        int ofs=15*ofc*(ofc+1)/2;
        int tos=21*toc*(toc+1)/2;
        int tfs=35*tfc*(tfc+1)/2;
        int ozfs=105*ozfc*(ozfc+1)/2;
        return ts+fs+ss-ofs-tfs-tos+ozfs;
    }
}