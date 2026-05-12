class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int[] output=new int[nums.length];
        int l= nums.length-1;
        int f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                output[f++]=nums[i];
            }
            else
            {
                output[l--]=nums[i];
            }
        }
        return output;
    }
}