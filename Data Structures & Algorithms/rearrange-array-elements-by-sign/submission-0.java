class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int j=0;
        List<Integer> neg= new ArrayList<>();
        List<Integer> pos= new ArrayList<>();
        int[] output= new int[nums.length];
        for(int n : nums)
        {
            if(n<0)
            {
                neg.add(n);
            }
            else
            {
                pos.add(n);
            }
        }
        for(int i=0;i<pos.size();i++)
        {
            output[j++]=pos.get(i);
            output[j++]=neg.get(i);
        }
        return output;
    }
}