class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int output=0;
        int count=0;
        if(nums.length<1)
        return 0;
        TreeSet<Integer> store= new TreeSet<>();
        for(int n : nums)
        {
            store.add(n);
        }
        List<Integer> convert= new ArrayList<>(store);
        for(int i=0;i<convert.size()-1;i++)
        {
            if((convert.get(i)+1)==convert.get(i+1))
            {
                output++;
                count=Math.max(count,output);
            }
            else
            {
                output=0;
            }    
        }
        return count+1;
    }
}
