class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        String fix= strs[0];
        for(int i=1;i<strs.length;i++)
        {
            int j=0;
            while(j<Math.min(fix.length(),strs[i].length()))
            {
                if(fix.charAt(j)!=strs[i].charAt(j))
                {
                    break;
                }
                j++;
            }
            fix=fix.substring(0,j);
        }
        return fix;
    }
}