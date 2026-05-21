class Solution 
{
    //check solutions for prefix sum.
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int ssum=0;
        for(int i=0;i<k-1;i++)
        {
            ssum=ssum+arr[i];
        }
        int output=0;
        for(int i=0;i<arr.length-k+1;i++)
        {
            ssum=ssum+arr[i+k-1];
            if(ssum/k>=threshold)
            {
                output++;
            }
            ssum=ssum-arr[i];
        }
        return output;
    }
}