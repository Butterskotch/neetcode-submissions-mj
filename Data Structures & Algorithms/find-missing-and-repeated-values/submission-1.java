class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int[] ans=new int[2];
        int n=grid.length*grid.length;
        Map<Integer,Integer> out=new HashMap<>();
        for(int p=1;p<n+1;p++)
        {
            out.put(p,0);
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                out.put(grid[i][j],out.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int k:out.keySet())
        {
            if(out.get(k)==2)
            {
                ans[0]=k;
            }
            if(out.get(k)==0)
            {
                ans[1]=k;
            }
        }
        return ans;
    }
}