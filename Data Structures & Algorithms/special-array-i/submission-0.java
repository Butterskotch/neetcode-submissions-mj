class Solution 
{
    public boolean isArraySpecial(int[] nums) 
    {
        int cnt=0;
        if(nums.length==1)
        {
            return true;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]%2==0&&nums[i+1]%2==1 || nums[i]%2==1&&nums[i+1]%2==0) 
            {
                cnt++;
            }
            else
            {
                return false;
            }
        }
        return cnt>0;
    }
}