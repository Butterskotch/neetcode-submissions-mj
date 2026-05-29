class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int l=0;
        for(int n : nums)
        {
            if(l<2 || n!=nums[l-2])
            {
                nums[l]=n;
                l++;
            }
        }
        return l;
    }
} 