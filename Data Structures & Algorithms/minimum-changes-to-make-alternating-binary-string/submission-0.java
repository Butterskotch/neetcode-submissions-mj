class Solution 
{
    public int minOperations(String s) 
    {
        int flip=0,count1=0;
        for(char c : s.toCharArray())
        {
            if(c-'0'!=flip)
            {
                count1++;
            }
            flip^=1;
        }
        flip=1;
        int count2=0;
        for(char c : s.toCharArray())
        {
            if(c-'0'!=flip)
            {
                count2++;
            }
            flip^=1;
        }
        return Math.min(count1,count2);
    }
}