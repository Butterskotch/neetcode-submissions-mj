class Solution 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        Set<Integer> one = new HashSet<>();
        Set<Integer> two = new HashSet<>();
        for(int n : nums1)
        {
            one.add(n);
        }
        for(int n : nums2)
        {
            two.add(n);
        }
        List<List<Integer>> output= new ArrayList<>();
        List<Integer> tone= new ArrayList<>();
        List<Integer> ttwo= new ArrayList<>();
        for(int n : one)
        {
            if(!two.contains(n))
            tone.add(n);
        }
        for(int n : two)
        {
            if(!one.contains(n))
            ttwo.add(n);
        }
        output.add(tone);
        output.add(ttwo);
        return output;
    }
}