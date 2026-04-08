class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        String[] sep=s.split(" ");
        Map<Character,String> one= new HashMap<>();
        Map<String,Character> two= new HashMap<>();
        if(pattern.length()!=sep.length)
        {
            return false;
        }
        for(int i=0;i<sep.length;i++)
        {
            String w= sep[i];
            char c= pattern.charAt(i);
            if(one.containsKey(c) && !one.get(c).equals(w))
            {
                return false;
            }
            if(two.containsKey(w) && two.get(w)!=c)
            {
                return false;
            }
            one.put(c,w);
            two.put(w,c);
        }
        return true;
    }
}