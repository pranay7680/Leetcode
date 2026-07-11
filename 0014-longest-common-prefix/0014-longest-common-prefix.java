class Solution {
    public String longestCommonPrefix(String[] v) {
        String pf=v[0];
        for(int i=1;i<v.length;i++){
            while(!v[i].startsWith(pf)){
                pf=pf.substring(0,pf.length()-1);
            }
        }
        return pf;
    }
}