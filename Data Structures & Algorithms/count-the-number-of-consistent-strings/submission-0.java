class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        Set<Character> given=new HashSet<>();
        for(char c : allowed.toCharArray())
        {
            given.add(c);
        }
        int out=words.length;
        for(String w : words)
        {
            for(char c : w.toCharArray())
            {
                if(!given.contains(c))
                {
                    out--;
                    break;
                }
            }
        }
        return out;
    }
}