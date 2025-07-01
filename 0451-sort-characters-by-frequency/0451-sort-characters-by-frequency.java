class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> maxheap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxheap.addAll(map.keySet());
        StringBuilder sb=new StringBuilder ();
        while(!maxheap.isEmpty()){
            char c=maxheap.poll();
            int count=map.get(c);
            sb.append(String.valueOf(c).repeat(count));
        }
        return sb.toString();
        
    }
}