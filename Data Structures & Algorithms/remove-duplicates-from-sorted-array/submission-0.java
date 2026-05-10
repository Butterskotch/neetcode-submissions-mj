class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int i=0;
        TreeSet<Integer> store= new TreeSet<>();
        for(int n : nums)
        {
            store.add(n);
        }
        for(int nn : store)
        {
            nums[i++]=nn;
        }
        return store.size();
    }
}