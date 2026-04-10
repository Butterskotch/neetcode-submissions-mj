class Solution 
{
    public int countCharacters(String[] words, String chars) 
    {
        Map<Character,Integer> charr= new HashMap<>();
        char[] ch= chars.toCharArray();
        for(char c:ch)
        {
            charr.put(c, charr.getOrDefault(c,0)+1);
        }
        int res=0;
        for(String w:words)
        {
            boolean good=true;
            char[] wc=w.toCharArray();
            Map<Character,Integer> wordd= new HashMap<>();
            for(char c : wc)
            {
                wordd.put(c, wordd.getOrDefault(c,0)+1);
                if(wordd.get(c)>charr.getOrDefault(c, 0))
                {
                    good=false;
                    break;
                }
            }
            if(good)
            res=res+w.length();
        }
        return res;
    }
}