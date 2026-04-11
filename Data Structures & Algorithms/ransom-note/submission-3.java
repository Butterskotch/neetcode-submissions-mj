class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int count=0;
        Map<Character,Integer> ransom=new HashMap<>();
        for(char c : ransomNote.toCharArray())
        {
            ransom.put(c, ransom.getOrDefault(c, 0)+1);
        }
        Map<Character,Integer> maga=new HashMap<>();
        for(char c : magazine.toCharArray())
        {
            maga.put(c, maga.getOrDefault(c, 0)+1);
        }
        for(char c : ransom.keySet())
        {
            if(maga.containsKey(c) && ransom.get(c)<=maga.get(c))
            {
               count++;
            }
            else
            {
                count=0;
                break;
            }
        }
        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}