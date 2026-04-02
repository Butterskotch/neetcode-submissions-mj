class Solution {
    public int[] replaceElements(int[] arr) 
    {
       
        int right=-1;
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            int great=arr[i+1];
            for(int j=i+1;j<n-1;j++)
            {
                if(great<arr[j+1])
                {
                    great=arr[j+1];
                }
            }
            arr[i]=great;
        }
        arr[n-1]=right;
        return arr;
    }
}