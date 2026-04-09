class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        int l=nums.length;
        int sum=0;
        Map<Integer,Integer> neuf=new HashMap<>();
        for(int i : nums)
        {
            neuf.put(i, neuf.getOrDefault(i,0)+1);
        }
        for(int c : neuf.values())
        {
            sum=sum+c;
        }
        if((sum)==l)
        {
            for(int i : nums)
            {
                if((neuf.get(i)%2)!=0)
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        return true;
    }
}