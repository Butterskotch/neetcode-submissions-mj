class Solution 
{
    public boolean checkSubarraySum(int[] nums, int k) 
    {
        int psum=0;
        Map<Integer,Integer> store= new HashMap<>();
        store.put(0, -1);
        for(int i=0;i<nums.length;i++)
        {
            psum=psum+nums[i];
            int check= psum%k;
            if(store.containsKey(check)&&((i-store.get(check))>1))
            {
                return true;
            }
            else if(!store.containsKey(check))
            store.put(check,i);
        }
        return false;
    }
}