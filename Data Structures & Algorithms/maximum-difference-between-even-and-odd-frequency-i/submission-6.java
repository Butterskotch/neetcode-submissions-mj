class Solution {
    public int maxDifference(String s) 
    {
        int even=0,odd=0,count=1;
        char[] ch= s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            if(count%2==0 && even==0)
            {
                even=count;
            }
            else if(count%2==0)
            {
                even= Math.min(even,count);
            }
            else if(odd<=count)
            {
                odd=count;
            }
            i=count+i-1;
            count=1;
        }
        return (odd-even);
    }
}