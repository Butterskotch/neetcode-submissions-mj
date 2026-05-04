class Solution {
    public void reverseString(char[] s) 
    {
        int n=0;
        if(s.length%2==0)
        {
            n=(s.length/2)-1;
        }
        else
        {
            n=s.length/2;
        }
        int l=s.length-1;
        for(int i=0;i<=n;i++)
        {
                char temp=s[i];
                s[i]=s[l];
                s[l]=temp;
                l--;
        }
    }
}