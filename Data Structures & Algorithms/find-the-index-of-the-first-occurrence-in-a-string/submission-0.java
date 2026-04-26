class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int temp=0;
        int h= haystack.length();
        int n = needle.length();
        for(int i=0;i<h-n+1;i++)
        {
            for(int j=0;j<needle.length();j++)
            {
                if(haystack.charAt(i+j)==needle.charAt(j))
                {
                    temp++;
                }
                else
                {
                    temp=0;
                }
                if(temp==needle.length())
                {               
                    return i;
                }
            }
        }
        return -1;
    }
}