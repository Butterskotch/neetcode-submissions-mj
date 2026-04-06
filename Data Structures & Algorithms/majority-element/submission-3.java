class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int n= nums.length;
        int count=0;
        int max=0,out=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            if(max<=count)
            {
                out=nums[i];
                max=count;
            }
            i=count+i;
            count=0;
        }
        return out;
    }
}