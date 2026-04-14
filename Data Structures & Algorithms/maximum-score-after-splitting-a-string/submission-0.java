class Solution 
{
    public int maxScore(String s) 
    {
        int output=0,left=0,right=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                left++;
            }
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(j)=='1')
                {
                    right++;
                }
            }
            output=Math.max(output,right+left);
            right=0;
        }
        return output;
    }
}