class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int l=nums.length;
        List<Integer> out= new ArrayList<>();
        for(int i=1;i<l+1;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(i==nums[j])
                {
                    break;
                }
                else if(i!=nums[j] && j==l-1)
                {
                    out.add(i);
                }
            }
        }
        return out;
    }
}