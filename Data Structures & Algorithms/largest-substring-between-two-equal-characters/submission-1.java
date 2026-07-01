class Solution 
{
    public int maxLengthBetweenEqualCharacters(String s) 
    {
        int f=0,count=-1;
        while(f<s.length())
        {
            for(int i=s.length()-1;i>=0;i--)
            {
                if(s.charAt(f)==s.charAt(i))
                {
                    count=Math.max(count,i-f-1);
                    f++;
                    break;
                }
            }
        }
        return count;
    }
}