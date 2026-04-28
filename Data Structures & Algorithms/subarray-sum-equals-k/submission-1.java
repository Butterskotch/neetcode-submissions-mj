class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        int count=0;
        int psum=0;
        Map<Integer,Integer> store= new HashMap<>();
        store.put(0,1);
        for(int n : nums)
        {
            psum=psum+n;
            if(store.containsKey(psum-k))
            {
                count=count+store.get(psum-k);
            }
            store.put(psum, store.getOrDefault(psum, 0)+1);
        }
        return count;
    }
}