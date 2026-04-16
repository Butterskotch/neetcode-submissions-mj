class Solution 
{
    public int firstUniqChar(String s) 
    {
        int out=0;
        char key=0;
        LinkedHashMap<Character,Integer> store= new LinkedHashMap<>();
        for(char c : s.toCharArray())
        {
            store.put(c, store.getOrDefault(c, 0)+1);
        }
        for(char c : store.keySet())
        {
            out=0;
            if(store.get(c)==1)
            {
                key= c;
                break;
            }
            else
            {
                out=-1;
            }
        }
        if(out==0)
        {
            char[] m=s.toCharArray();
            for(int i=0;i<m.length;i++)
            {
                if(m[i]==key)
                {
                    out=i;
                }
            }
        }
        return out;
    }
}