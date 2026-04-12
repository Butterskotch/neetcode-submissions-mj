class Solution 
{
    public int maxProductDifference(int[] nums) 
    {
        int prod=0,max=0,min=nums[1]*nums[2];
        for( int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                continue;
                prod=nums[i]*nums[j];
                max=Math.max(max,prod);
                min=Math.min(min,prod);
            }
        }
        return max-min;
    }
}