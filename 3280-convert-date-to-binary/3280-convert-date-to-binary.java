class Solution {
    public String convertDateToBinary(String date) {
        // String [] s = date.split("-");
        // String res[] =new String[s.length];
        // int j=0;
        // for(String i:s){
        //     int n = Integer.parseInt(i);
        //     StringBuilder bb = new StringBuilder();
        //     while(n>0){
        //         bb.append(n%2);
        //         n = n/2;
        //     }
        //     bb.reverse();
        //     res[j]=bb.toString();
        //     j++;
        // }
        // return String.join("-",res);
        StringBuilder ans = new StringBuilder();
        int sum=0;
        for(int i=0;i<date.length();i++){
            char ch = date.charAt(i);
            if(ch=='-'){
                ans.append(Integer.toBinaryString(sum));
                ans.append('-');
                sum=0;
            }
            else{
                sum = sum*10+ ch-'0';
            }
            if(i==date.length()-1){
                ans.append(Integer.toBinaryString(sum));
            }
        }
        return ans.toString();
    }
}