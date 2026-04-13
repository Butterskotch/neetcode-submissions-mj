class Solution 
{
    public String largestGoodInteger(String num) 
    {
        String out="";
        for(int i=1;i<num.length()-1;i++)
        {
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i-1)==num.charAt(i))
            {
                String tem=num.substring((i-1),(i+2));
                //compare to compares character by character
                if(tem.compareTo(out)>0)
                {
                    out=tem;
                }
            }
        }
        return out;
    }
}