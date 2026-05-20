class Solution 
{
    public int minimumDifference(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int r=0,l=k-1,output=999999;
        while(l<nums.length)
        {
            output=Math.min(output,nums[l]-nums[r]);
            l++;
            r++;
        }
        return output;
    }
}