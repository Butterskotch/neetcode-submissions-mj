class Solution 
{
    public int maxNumberOfBalloons(String text) 
    {
        Map<Character,Integer> all=new HashMap<>();
        for(char c : text.toCharArray())
        {
            all.put(c, all.getOrDefault(c, 0)+1);
        }
        Map<Character,Integer> ball=new HashMap<>();
        for(char c : "balloon".toCharArray())
        {
            ball.put(c, ball.getOrDefault(c,0)+1);
        }
        int out=text.length();
        for(char c : ball.keySet())
        {
            out=Math.min(out,all.getOrDefault(c,0)/ball.get(c));
        }
        return out;
    }
}