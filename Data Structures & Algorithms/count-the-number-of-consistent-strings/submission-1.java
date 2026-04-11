class Solution 
{
    public int countConsistentStrings(String allowed, String[] words)
    {
        int count=0;
        int out=0;
        int l=words.length;
        char[] given =allowed.toCharArray();
        for(int i=0;i<l;i++)
        {
            for(char c : given)
            {
                for(int j=0;j<words[i].length();j++)
                {
                    if(c==words[i].charAt(j))
                    {
                        count++;
                        //break;
                    }
                }
            }
            if(count==words[i].length())
            {
                out++;
            }
            count=0;
        }
        return out;
    }
}