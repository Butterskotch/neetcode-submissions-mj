class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int min= 999999;
        int f=0,r=0,sum=0;
        boolean flag=true;
        while(r<nums.length)
        {
            sum=sum+nums[r];
            if(sum>=target)
            {
                min=Math.min(min,r-f+1);
                f=f+1;
                r=f;
                flag=false;
                sum=0;
                continue;
            }
            r++;
        }
        if(flag)
        {
            return 0;
        }
        return min;
    }
}