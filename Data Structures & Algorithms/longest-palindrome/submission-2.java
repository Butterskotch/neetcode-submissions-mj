class Solution 
{
    public int longestPalindrome(String s) 
    {
        int count1=0,count2=0;
        Map<Character,Integer> track= new HashMap<>();
        for(char ch : s.toCharArray())
        {
            track.put(ch,track.getOrDefault(ch,0)+1);
        }
        for(char ch : track.keySet())
        {
            if(track.get(ch)%2==0)
            {
                count1=count1+track.get(ch);
            }
            else if(track.get(ch)%2!=0 && count2==0)
            {
                count2=track.get(ch);
            }
            else
            {
                count1=count1+(track.get(ch)-1);
            }
        }
        return count1+count2;
    }
}