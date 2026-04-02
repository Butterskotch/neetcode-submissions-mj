class Solution {
    public int lengthOfLastWord(String s) 
    {
        int count=0;
        int i=s.length()-1;
        while(s.charAt(i)==' ')
        {
            i--;
        }
        do 
        {
            if(s.charAt(i)==' ')
            {
               break;
            }
            count++;
            i--;
        }while(i>0);
        return count;
    }
}