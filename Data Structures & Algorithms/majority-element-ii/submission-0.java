class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int l= nums.length/3;
        Map<Integer,Integer> store= new HashMap<>();
        for( int n : nums)
        {
            store.put(n, store.getOrDefault(n, 0)+1);
        }
        List<Integer> output= new ArrayList<>();
        for(int n : store.keySet())
        {
            if(store.get(n)>l)
            {
                output.add(n);
            }
        }
        return output;
    }
}