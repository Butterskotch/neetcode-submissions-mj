class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> freq= new HashMap<>();
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        List<int[]> temp= new ArrayList<>();
        for(Map.Entry<Integer,Integer> check : freq.entrySet())
        {
            temp.add(new int[] {check.getValue(),check.getKey()});
        }
        temp.sort((a,b) -> (b[0]-a[0]));

        int[] output= new int[k];
        for(int i=0;i<k;i++)
        {
            output[i]=temp.get(i)[1];
        }
        return output;
    }
}
