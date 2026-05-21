class Solution 
{
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) 
    {
        int satisfied=0;
        int l= customers.length;
        for(int i=0;i<l;i++)
        {
            if(grumpy[i]==0)
            {
                satisfied+=customers[i];
            }
        }
        int tempo=0;
        for(int i=0;i<l-minutes+1;i++)
        {
            int temp=0;
            for(int j=i;j<minutes+i;j++)
            {
                if(grumpy[j]==1)
                {
                    temp+=customers[j];
                }
            }
           tempo=Math.max(tempo,temp);
        }
        return satisfied+tempo;
    }
}