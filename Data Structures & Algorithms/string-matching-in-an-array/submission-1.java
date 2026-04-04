class Solution {
    public List<String> stringMatching(String[] words)
    {
        List<String> out=new ArrayList<>();
        Arrays.sort(words,Comparator.comparingInt(String::length));
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[j].contains(words[i]))
                {
                    out.add(words[i]);
                    break;
                }
            }
        }
        return out;
    }
}