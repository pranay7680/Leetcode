class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int c=m.getOrDefault(ch,0)+1;
            m.put(ch,c);
        }
        int x=m.get(s.charAt(0));
        for(Map.Entry<Character,Integer> e:m.entrySet()){
            if(x!=e.getValue()){
                return false;
            }
        }
        return true;
        
    }
}