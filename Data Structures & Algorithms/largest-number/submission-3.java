class Solution 
{
    public String largestNumber(int[] nums) 
    {
        String[] convert=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            convert[i]=String.valueOf(nums[i]);
        }
        Arrays.sort((convert),(a,b) -> (b+a).compareTo(a+b));
        StringBuilder out= new StringBuilder();
        for(String s : convert)
        {
            out.append(s);
        }
        String output=out.toString();
        if(output.charAt(0)=='0')
        return "0";
        return output;
    }
}