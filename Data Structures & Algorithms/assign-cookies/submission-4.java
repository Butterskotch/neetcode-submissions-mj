class Solution 
{
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int gg=0,ss=0;
        while(gg<g.length && ss<s.length)
        {
            if(g[gg]<=s[ss])
            {
                gg++;
            }
            ss++;
        }
        return gg;
    }
}