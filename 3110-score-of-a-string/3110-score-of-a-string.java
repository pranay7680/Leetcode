class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int j=1;j<s.length();j++){
            char a = s.charAt(j);
            char b = s.charAt(j-1);
            sum = sum + Math.abs(a-b);
        }
        return sum;
    }
}