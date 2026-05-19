class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
        Arrays.sort(nums);
        int l= nums.length;
        int check=1;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>0 && nums[i]==check)
            {
                check++;
            }
        }
        return check;
    }
}