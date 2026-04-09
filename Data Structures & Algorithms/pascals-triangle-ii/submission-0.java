class Solution 
{
    public List<Integer> getRow(int rowIndex) 
    {
        Map<Integer,List<Integer>> out= new HashMap<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> tem= new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(i==j || j==0)
                {
                    tem.add(1);
                }
                else
                {
                    tem.add(out.get(i-1).get(j-1)+out.get(i-1).get(j));
                }
            }
            out.put(i,tem);
        }
        return out.get(rowIndex);
    }
}