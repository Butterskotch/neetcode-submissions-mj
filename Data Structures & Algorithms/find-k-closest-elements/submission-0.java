class Solution 
{
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        int f=0,r=arr.length-1;
        while(r-f>=k)
        {
            if((Math.abs(x-arr[f]))<=(Math.abs(x-arr[r])))
            {
                r--;
            }
            else
            {
                f++;
            }
        }
        List<Integer> output= new ArrayList<>();
        for(int i=f;i<=r;i++)
        {
            output.add(arr[i]);
        }
        return output;
    }
}