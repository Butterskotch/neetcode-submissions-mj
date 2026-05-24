class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> store= new HashSet<>();
        int count=0;
        int l=0;
        char[] ch= s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            while(store.contains(ch[i]))
            {
                store.remove(ch[l]);
                l++;
            }
            store.add(ch[i]);
            count=Math.max(count,i-l+1);
        }
        return count;
    }
}
