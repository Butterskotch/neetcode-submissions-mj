class Solution 
{
    public boolean validPalindrome(String s) 
    {
        int f=0,r=s.length()-1;
        while(f<r)
        {
            if(s.charAt(f)!=s.charAt(r))
            {
                return check(s,f+1,r) || check(s,f,r-1);
            }
            f++;
            r--;
        }
        return true;
    }
    private boolean check(String s,int f, int r)
    {
        while(f<r)
        {
            if(s.charAt(f)!=s.charAt(r))
            {
                return false;
            }
            f++;
            r--;
        }
        return true;
    }
}