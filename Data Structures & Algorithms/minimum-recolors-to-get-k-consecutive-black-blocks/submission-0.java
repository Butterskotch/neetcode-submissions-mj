class Solution 
{
    public int minimumRecolors(String blocks, int k) 
    {
        int counter=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                counter++;
            }
        }
        int output=counter;
        for(int i=k;i<blocks.length();i++)
        {
            if(blocks.charAt(i-k)=='W')
            {
                counter--;
            }
            if(blocks.charAt(i)=='W')
            {
                counter++;
            }
            output= Math.min(output,counter);
        }
        return output;
    }
}