class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int l=flowerbed.length;
        int[] neuf=new int[l+2];
        for(int i=0;i<l;i++)
        {
            neuf[i+1]=flowerbed[i];
        }
        for(int j=1;j<neuf.length-1;j++)
        {
            if(neuf[j-1]==0 && neuf[j]==0 && neuf[j+1]==0)
            {
                n--;
                neuf[j]=1;
            }
        }
        return n<=0;
    }
}