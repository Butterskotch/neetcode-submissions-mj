class Solution 
{
    public int numUniqueEmails(String[] emails)
    {
        Set<String> uni=new HashSet();
        for(String s: emails)
        {
            int i=0;
            StringBuilder out= new StringBuilder();
            while(i<s.length() && s.charAt(i)!='+' && s.charAt(i)!='@')
            {
                if(s.charAt(i)!='.')
                {
                    out.append(s.charAt(i));
                }
                i++;
            }
            while(i<s.length() && s.charAt(i)!='@')
            {
                i++;
            }
            String last=s.substring(i+1);
            uni.add(out.toString()+"@"+last);
        }
        return uni.size();
    }
}