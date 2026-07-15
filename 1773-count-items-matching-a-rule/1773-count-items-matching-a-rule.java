class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx=2;
        if(ruleKey.equals("type")){
            idx=0;
        }else if(ruleKey.equals("color")){
            idx=1;
        }
        int c=0;
        for(List<String> item:items){
            if(item.get(idx).equals(ruleValue)){
                c++;
            }
        }
        return c;
    }
}