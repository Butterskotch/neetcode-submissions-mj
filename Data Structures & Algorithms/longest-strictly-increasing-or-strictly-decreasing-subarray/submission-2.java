class Solution
{
    public int longestMonotonicSubarray(int[] nums) 
    {
        int temp=1;
        int out=1;
        int tempo=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                temp++;
                tempo=1;
            }
            else if(nums[i]<nums[i+1])
            {
                 tempo++;
                 temp=1;
            }
            else
            {
                tempo=temp=1;
            } 
            out=Math.max(out,Math.max(temp,tempo));
        }
        return out;
    }
}