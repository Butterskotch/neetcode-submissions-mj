class Solution 
{
    public int maxArea(int[] heights) 
    {
        int f=0,r=heights.length-1;
        int store=0;
        while(f<r)
        {
            int area= Math.min(heights[f],heights[r]) * (r-f);
            store= Math.max(store,area);
            if(heights[f]<=heights[r])
            {
                f++;
            }
            else
            {
                r--;
            }
        }
        return store;
    }
}
