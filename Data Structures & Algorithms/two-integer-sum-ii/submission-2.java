class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int t=0,b=numbers.length-1;
        while(t<b)
        {
            if(numbers[t]+numbers[b]>target)
            {
                b--;
            }
            else if(numbers[t]+numbers[b]<target)
            {
                t++;
            }
            else
            {
                return new int[]{t+1,b+1};
            }
        }
        return new int[0];
    }
}
