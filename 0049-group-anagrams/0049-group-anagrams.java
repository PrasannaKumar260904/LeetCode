class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //hashmap based solution key:string value :list<of grouped anagrams>
        if(strs==null||strs.length==0)return new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char [] ch=s.toCharArray();
            Arrays.sort(ch);
            String sortedKey=String.valueOf(ch);
            map.putIfAbsent(sortedKey,new ArrayList<>());
            map.get(sortedKey).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
}