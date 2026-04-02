class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        return recur(s,t,0,0);
    }
    public boolean recur(String s,String t,int i,int j)
    {
        if(i==s.length())
        {
            return true;
        }
        if(j==t.length())
        {
            return false;
        }
        if(s.charAt(i)==t.charAt(j))
        {
            return recur(s,t,i+1,j+1);
        }
        return recur(s,t,i,j+1);
    }
    
}