class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {
        int l=nums.length;
        int j= 0;
        if(nums[j]>nums[l-1])
        {
            for(int i=1;i<l;i++)
            {
                if(nums[i-1]<nums[i])
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            for(int n=1;n<l;n++)
            {
                if(nums[n-1]>nums[n])
                {
                    return false;
                }
            }
            return true;
        }
    }
}