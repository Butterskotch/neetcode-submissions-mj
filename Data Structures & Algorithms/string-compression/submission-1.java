class Solution 
{
    public int compress(char[] chars) 
    {
        StringBuilder s= new StringBuilder();
        int i=0;
        int n = chars.length;
        while(i<n)
        {
            s.append(chars[i]);
            int j=i+1;
            while(j<n && chars[i]==chars[j])
            {
                j++;
            }
            if(j-i>1)
            {
                s.append(j-i);
            }
            i=j;
        }
        for(int k=0;k<s.length();k++)
        {
            chars[k]=s.charAt(k);
        }
        return s.length();
    }
}