class Solution 
{
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,i=0;;
        int ch=0,j=0;
        while(ch<s.length && c<g.length)
        {
            if(g[c]<=s[ch])
            {
                c++;
            }
            ch++;
        }
        return c;
    }
}