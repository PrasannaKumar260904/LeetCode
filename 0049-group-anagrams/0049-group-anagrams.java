class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //hashmap based solution key:string value :list<of grouped anagrams>
        // if(strs==null||strs.length==0)return new ArrayList<>();
        // HashMap<String,List<String>> map=new HashMap<>();
        // for(String s:strs){
        //     char [] ch=s.toCharArray();
        //     Arrays.sort(ch);
        //     String sortedKey=String.valueOf(ch);
        //     map.putIfAbsent(sortedKey,new ArrayList<>());
        //     map.get(sortedKey).add(s);

        // }
        // return new ArrayList<>(map.values());
        if(strs==null||strs.length==0)return new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        int [] count =new int[26];
        for(String s:strs){
            Arrays.fill(count,0);
            for(char ch:s.toCharArray()){
                count[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<26;i++){
                sb.append('#');
                sb.append(count[i]);
            }
            String key=sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
            

        }
        return new ArrayList <> (map.values());
        
    }
}