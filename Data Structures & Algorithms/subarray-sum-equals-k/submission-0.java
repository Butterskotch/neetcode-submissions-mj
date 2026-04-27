class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        int count=0,sum=0;
        Map<Integer,Integer> store= new HashMap<>();
        store.put(0,1);
        for(int n : nums)
        {
            sum=sum+n;
            if(store.containsKey(sum-k))
            {
                count=count+store.get(sum-k);
            }
            store.put(sum,store.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}