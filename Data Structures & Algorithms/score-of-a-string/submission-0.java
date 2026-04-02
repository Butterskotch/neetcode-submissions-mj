class Solution {
    public int scoreOfString(String s) 
    {
        int score=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int ch=0;
            ch=(s.charAt(i+1)-s.charAt(i));
            if(ch<0)
            {
                ch=ch*(-1);
            }
            score=score+ch;
        }
        return score;
    }
}