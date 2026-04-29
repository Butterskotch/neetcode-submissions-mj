class Solution 
{
    public int minOperations(int[] nums) 
    {
        Map<Integer,Integer> store= new HashMap<>();
        for(int n : nums)
        {
            store.put(n, store.getOrDefault(n,0)+1);
        }
        int output=0;
        for(int count : store.values())
        {
            if(count==1)
            {
                return -1;
            }
            else
            {
                output=output+((count+2))/3;
            }
        }
        return output;
    }
}