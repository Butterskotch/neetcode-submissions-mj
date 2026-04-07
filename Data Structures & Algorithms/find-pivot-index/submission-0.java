class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int sum=0;
        int lsum=0;
        int rsum=0;
        for(int n:nums)
        {
            sum=sum+n;
        }
        for(int i=0;i<nums.length;i++)
        {
            rsum=sum-lsum-nums[i];
            if(lsum==rsum)
            {
                return i;
            }
            lsum=lsum+nums[i];
        }
        return -1;
    }
}