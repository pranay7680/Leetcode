class Solution {
    public boolean isAnagram(String s, String t) {
        int se=s.length();
        if(se!=t.length()){
            return false;
        }
        int[] arr=new int[26];

        for(int i=0;i<se;i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;

    }
}