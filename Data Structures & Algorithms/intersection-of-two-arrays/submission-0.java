class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> temp=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    temp.add(nums1[i]);
                }
            }
        }
        int l=temp.size();
        int k=0;
        int[] out= new int[l];
        for(int p : temp)
        {
            out[k]=p;
            k++;
        }
        return out;
    }
}