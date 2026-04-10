class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int l1=nums1.length;
        int l2=nums2.length;
        int[] out= new int[l1];
        Arrays.fill(out,-1);
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(nums1[i]==nums2[j] && j!=l2-1)
                {
                    for(int k=j+1;k<l2;k++)
                    {
                        if(nums2[j]<nums2[k])
                        {
                            out[i]=nums2[k];
                            break;
                        }
                    }
                }
                /*else if(nums1[i]==nums2[j] && j==l2-1)
                {
                    out[i]=-1;
                }*/
            }
        }
        return out;
    }
}