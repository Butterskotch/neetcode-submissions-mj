class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> ag = new HashMap<>();
        for(String s:strs)
        {
            char[] chararray= s.toCharArray();
            Arrays.sort(chararray);
            String sorted=new String(chararray);
            ag.putIfAbsent(sorted,new ArrayList<>());
            ag.get(sorted).add(s);
        }
        return new ArrayList<>(ag.values());
    }
}
