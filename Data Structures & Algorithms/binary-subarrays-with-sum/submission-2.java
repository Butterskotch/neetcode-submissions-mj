class Solution 
{
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        int sum=0,count=0;
        Map<Integer,Integer> store= new HashMap<>();
        store.put(0, 1);
        for(int n : nums)
        {
            sum=sum+n;
            if(store.containsKey(sum-goal))
            {
                count=count+store.get(sum-goal);
            }
            store.put(sum,store.getOrDefault(sum,0)+1);
        }
        return count;
    }
}