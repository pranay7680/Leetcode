class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        int c=arr[s.charAt(0)-'a'];
        for(int i:arr){
            if(i!=0 && i!=c){
                return false;
            }
        }
        return true;
        
    }
}