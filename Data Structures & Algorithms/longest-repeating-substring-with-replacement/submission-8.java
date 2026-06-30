class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        Map<Character,Integer> store= new HashMap<>();
        int l=0;int maxfr=0,output=0;
        for(int i=0;i<s.length();i++)
        {
            store.put(s.charAt(i), store.getOrDefault(s.charAt(i), 0)+1);
            maxfr= Math.max(maxfr,store.get(s.charAt(i)));
            while((i-l+1)-maxfr>k)
            {
                store.put(s.charAt(l), (store.get(s.charAt(l))-1));
                l++;
            }
            output=Math.max(output,(i-l+1));
        }
        return output;
    }
}
