class Solution {
    public void moveZeroes(int[] arr) {
    int size=arr.length;
    int end=0;
    for(int i=0;i<size;i++)
    {
        if(arr[i]!=0)
        {
            arr[end]=arr[i];
            end++;
        }
        
    }
    for(int i=end;i<size;i++)
    {
        arr[i]=0;
    }
    return;
    }
}