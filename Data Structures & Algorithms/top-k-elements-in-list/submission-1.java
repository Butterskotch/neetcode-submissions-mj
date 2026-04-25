class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int[] output= new int[k];
        Map<Integer,Integer> store= new HashMap<>();
        for(int n : nums)
        {
            store.put(n,store.getOrDefault(n,0)+1);
        }
        List<int[]> convert= new ArrayList<>();
        for(Map.Entry<Integer,Integer> check : store.entrySet())
        {
            convert.add(new int[]{check.getValue(),check.getKey()});
        }
        convert.sort((a,b) -> (b[0]-a[0]));
        for(int i=0;i<k;i++)
        {
            output[i]=convert.get(i)[1];
        }
        return output;
    }
}
