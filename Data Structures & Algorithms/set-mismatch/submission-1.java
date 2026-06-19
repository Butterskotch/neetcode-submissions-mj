class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int l=nums.length;
        int[] output= new int[2];
        Map<Integer,Integer> store= new HashMap<>();
        for(int n : nums)
        {
            store.put(n, store.getOrDefault(n,0)+1);
        }
        for(int i=1;i<=l;i++)
        {
            if(!store.containsKey(i))
            {
                output[1]=i;
                continue;
            }
            if(store.get(i)==2)
            {
                output[0]=i;
            }
        }
        return output;
    }
}