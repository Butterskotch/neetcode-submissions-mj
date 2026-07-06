class Solution 
{
    public boolean makeEqual(String[] words) 
    {
        int l=words.length;
        HashMap<Character,Integer> store= new HashMap<>();
        for(String c : words)
        {
            char[] ch=c.toCharArray();
            for(char m : ch)
            {
                store.put(m, store.getOrDefault(m, 0)+1);
            }
        }
        for(char c : store.keySet())
        {
            if(store.get(c)%l!=0)
            {
                return false;
            }
        }
        return true;
    }
}