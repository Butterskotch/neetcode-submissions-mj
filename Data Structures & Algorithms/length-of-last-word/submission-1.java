class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        //int ctr=0;
        String[] spl=s.split("\\s+");
        int l=spl.length;
        return spl[l-1].length();
    }
}