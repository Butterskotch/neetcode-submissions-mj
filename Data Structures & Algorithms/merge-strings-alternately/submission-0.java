class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder out= new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && j<word2.length())
        {
            out.append(word1.charAt(i++));
            out.append(word2.charAt(j++));
        }
        out.append(word1.substring(i));
        out.append(word2.substring(j));
        return out.toString();
    }
}