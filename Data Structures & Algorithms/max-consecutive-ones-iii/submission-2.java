class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {
        int output=0,cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            int r=i;
            while(r<nums.length)
            {
                if(nums[r]==0)
                {
                    if(cnt==k)
                    {
                        cnt=0;
                        break;
                    }
                    cnt++;
                }
                r++;
            }
            output=Math.max(output,r-i);
        }
        return output;
    }
}