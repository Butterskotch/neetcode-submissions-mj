class Solution 
{
    public void wiggleSort(int[] nums) 
    {
        int temp=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i+=2)
        {
            temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
    }
}
