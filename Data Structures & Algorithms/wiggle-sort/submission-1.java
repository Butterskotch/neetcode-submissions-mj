class Solution 
{
    public void wiggleSort(int[] nums) 
    {
        int temp=0;
        Arrays.sort(nums);
        if(nums.length==3)
        {
            temp=nums[1];
            nums[1]=nums[2];
            nums[2]=temp;
        }
        for(int i=1;i<nums.length-2;i+=2)
        {
            temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
    }
}
