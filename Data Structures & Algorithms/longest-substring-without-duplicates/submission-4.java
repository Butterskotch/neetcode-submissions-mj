class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> store= new HashSet<>();
        int count=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            while(store.contains(s.charAt(i)))
            {
                store.remove(s.charAt(l));
                l++;
            }
            store.add(s.charAt(i));
            count=Math.max(count,i-l+1);
        }
        return count;
    }
}
