class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int l= nums.length;
        PriorityQueue<Integer> store= new PriorityQueue<>();
        int[] output=new int[l];
        for(int n :nums)
        {
            store.add(n*n);
        }
        for(int i=0;i<l;i++)
        {
            output[i]=store.poll();
        }
        return output;
    }
}