class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0,r=matrix[0].length-1,u=0,d=matrix.length-1;
        List<Integer> lis=new ArrayList<>(); 
        while(l<=r && u<=d){
                for(int i=l;i<=r;i++){
                    lis.add(matrix[u][i]);
                }
                u++;
                for(int i=u;i<=d;i++){
                    lis.add(matrix[i][r]);
                }
                r--;
                if(u<=d){
                    for(int i=r;i>=l;i--){
                        lis.add(matrix[d][i]);
                    }
                    d--;
                }
                if(l<=r){
                    for(int i=d;i>=u;i--){
                        lis.add(matrix[i][l]);
                    }
                    l++;
                }
            }

            return lis;
        }
    }