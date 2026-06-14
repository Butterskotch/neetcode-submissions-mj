class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        int[] store= new int[26];
        int[] check= new int[26];
        int l1= s1.length();
        for(int i=0;i<s1.length();i++)
        {
            store[(s1.charAt(i)-'a')]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            check[(s2.charAt(i)-'a')]++;
            if(i>=l1)
            {
                check[(s2.charAt(i-l1)-'a')]--;
            }
            if(Arrays.equals(store,check))
            {
                return true;
            }
        }
        return false;
    }
}
