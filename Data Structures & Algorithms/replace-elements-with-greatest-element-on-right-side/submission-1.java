class Solution 
{
    public int[] replaceElements(int[] arr) 
    {
        int l=arr.length;
        int[] output=new int[l];
        int right=-1;
        for(int i=l-1;i>=0;i--)
        {
            output[i]=right;
            right=Math.max(right,arr[i]);
        }
        return output;
    }
}