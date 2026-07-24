class Solution {
    public String convertDateToBinary(String date) {
        String [] s = date.split("-");
        String res[] =new String[s.length];
        int j=0;
        for(String i:s){
            int n = Integer.parseInt(i);
            StringBuilder bb = new StringBuilder();
            while(n>0){
                bb.append(n%2);
                n = n/2;
            }
            bb.reverse();
            res[j]=bb.toString();
            j++;
        }
        return String.join("-",res);
    }
}