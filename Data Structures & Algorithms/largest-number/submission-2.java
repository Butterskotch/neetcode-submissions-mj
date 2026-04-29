class Solution
{
    public String largestNumber(int[] nums)
    {
        String[] convert=Arrays.stream(nums).mapToObj(String :: valueOf).toArray(String[] :: new);
        Arrays.sort(convert,(a,b) -> (b+a).compareTo(a+b));
        String output=String.join("",convert);
        return output.charAt(0)=='0'?"0":output;
        
    }
}