class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String,List<String>> out= new HashMap<>();
        for(String s:strs)
        {
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            String srt=new String(ch);
            out.putIfAbsent(srt,new ArrayList<>());
            out.get(srt).add(s);
        }
        return new ArrayList<>(out.values());
    }
}
