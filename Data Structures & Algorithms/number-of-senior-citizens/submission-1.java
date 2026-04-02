class Solution {
    public int countSeniors(String[] details) 
    {
        int count=0;
        for(String b:details)
        {
            int a=b.charAt(11)-'0';
            int g=b.charAt(12)-'0';
            int age= a*10+g;
            if(age>60)
            {
                count++;
            }
        }
        return count;
    }
}