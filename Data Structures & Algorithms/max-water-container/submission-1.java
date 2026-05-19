class Solution 
{
    public int maxArea(int[] heights) 
    {
        int water=0;
        int storage=0;
        int n= heights.length;
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(heights[i]<=heights[j])
                {
                    storage=Math.max(storage,heights[i]*count++);
                }
                else
                {
                    storage=Math.max(storage,heights[j]*count++);
                }
            }
            water=Math.max(water,storage);
        }
        return storage;
    }
}
