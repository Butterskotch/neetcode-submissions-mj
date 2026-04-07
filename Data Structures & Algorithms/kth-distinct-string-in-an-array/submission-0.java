class Solution 
{
    public String kthDistinct(String[] arr, int k) 
    {
        Map<String,Integer> count = new HashMap<>();
        for(String n:arr)
        {
            //count.put(n, count.getOrDefault(n, 0)+1);
            if(count.containsKey(n))
            {
                count.put(n, count.get(n)+1);
            }
            else
            {
                count.put(n,1);
            }
        }
        for(String s:arr)
        {
            if(count.get(s)==1)
            {
                k--;
            }
            if(k==0)
            {
                return s;
            }
        }
        return "";
    }
}