class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        int k=0;
        int[] output= new int[nums.length];
        Map<Integer,Integer> freq= new HashMap<>();
        for(int n : nums)
        {
            freq.put(n, freq.getOrDefault(n,0)+1);
        }
        List<int[]> temp= new ArrayList<>();
        for(Map.Entry<Integer,Integer> check : freq.entrySet())
        {
            temp.add(new int[]{check.getValue(),check.getKey()});
        }
        //temp.sort((a,b) -> (b[0]-a[0]));
        temp.sort((a,b) -> 
        {
            if(a[0]==b[0])
            {
               return b[1]-a[1];
            }
            else
            {
                return a[0]-b[0];
            }
        });
        for(int i=0;i<temp.size();i++)
        {
            for(int j=0;j<temp.get(i)[0];j++)
            {
                output[k]=temp.get(i)[1];
                k++;
            }
        }
        return output;
    }
}