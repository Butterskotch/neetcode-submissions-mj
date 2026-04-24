class Solution 
{
    public String customSortString(String order, String s) 
    {
        int k=0;
        char temp;
        char[] lr= s.toCharArray();
        for(int i=0;i<order.length();i++)
        {
            for(int j=0;j<lr.length;j++)
            {
                if(order.charAt(i)==lr[j])
                {
                    temp= lr[k];
                    lr[k]=lr[j];
                    lr[j]=temp;
                    k++;
                }
            }
        }
        String out= new String(lr);
        return out;
    }
}