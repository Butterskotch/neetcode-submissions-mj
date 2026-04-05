class Solution {
    public boolean isIsomorphic(String s, String t)
    {
       HashMap<Character,Character> first= new HashMap<>();
       HashMap<Character,Character> second= new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
            char ch=s.charAt(i);
            char th=t.charAt(i);
            if(first.containsKey(ch) && first.get(ch)!=th || 
            second.containsKey(th) && second.get(th)!=ch)
            {
                return false;
            }
            first.put(ch, th);
            second.put(th, ch);
       }
            return true;
    }
}