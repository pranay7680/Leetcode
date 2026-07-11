class Solution {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        boolean res=true;
        while(left<=right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            char l= Character.toLowerCase(s.charAt(left));
            char r= Character.toLowerCase(s.charAt(right));
            if(l!=r){
                res=false;
                break;
            }
            left++;
            right--;
        }
        return res;
    }
}