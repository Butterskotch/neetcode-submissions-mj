class Solution 
{
    public int numRescueBoats(int[] people, int limit) 
    {
        Arrays.sort(people);
        int f=0,r=people.length-1;
        int output=0;
        while(f<=r)
        {
            if(people[r]==limit)
            {
                output++;
                r--;
            }
            else if(people[r]+people[f]<=limit)
            {
                output++;
                r--;
                f++;
            }
            else
            {
                output++;
                r--;
            }
        }
        return output;
    }
}