class Solution {
    private int GCD(int a,int b){
        if(b%a==0){
            return a;
        }
        return GCD(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return 1;
        }
        int nn=n*2;
        int total= nn*(nn+1)/2;
        int soe=2*n*(n+1)/2;
        int soo=total-soe;
        return GCD(soo,soe);

    }
}