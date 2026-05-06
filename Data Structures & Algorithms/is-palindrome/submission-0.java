class Solution 
{
    public boolean isPalindrome(String s) 
    {
        StringBuilder str= new StringBuilder();
        char[] ch= s.toCharArray();
        for(char c : ch)
        {
            if(Character.isLetterOrDigit(c))
            {
                str.append(Character.toLowerCase(c));
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}
