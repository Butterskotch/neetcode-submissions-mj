class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int[] output= new int[2];
        Map<Integer,Integer> store= new HashMap<>();
        for(int n : nums)
        {
            store.put(n, store.getOrDefault(n,0)+1);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(store.getOrDefault(i,0)==2)
            {
                output[0]=i;
            }
            if(!store.containsKey(i))
            {
                output[1]=i;
            }
        }
        return output;
    }
}