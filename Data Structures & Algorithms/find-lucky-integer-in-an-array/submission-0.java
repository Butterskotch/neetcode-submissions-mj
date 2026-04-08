class Solution 
{
    public int findLucky(int[] arr) 
    {
        int out=-1;
        Map<Integer,Integer> luck =new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            luck.put(arr[i], luck.getOrDefault(arr[i],0)+1);
        }
        for(int n : luck.keySet())
        {
            if(luck.get(n)==n)
            {
                out=Math.max(out,luck.get(n));
            }
        }
        return out;
    }
}