class Solution 
{
    public int minimumRecolors(String blocks, int k) 
    {
        int output=0,count=0;
        int l= blocks.length();
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                count++;
            }
        }
        output=count;
        for(int i=k;i<l;i++)
        {
            if(blocks.charAt(i-k)=='W')
            {
                count--;
            }
            if(blocks.charAt(i)=='W')
            {
                count++;
            }
            output=Math.min(count,output);
        }
        return output;    
    }
}