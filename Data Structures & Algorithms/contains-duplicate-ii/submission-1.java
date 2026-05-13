class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Map<Integer,Integer> store= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(store.containsKey(nums[i]) && i-store.get(nums[i])<=k)
            {
                return true;
            }
            store.put(nums[i], i);
        }
        return false;
    }
}