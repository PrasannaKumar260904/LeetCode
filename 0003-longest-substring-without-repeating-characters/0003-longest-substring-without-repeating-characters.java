class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n=s.length();
        int left=0,right=0,maxLen=0;
        
        Map<Character,Integer> map=new HashMap<>();

        while(right<n){

            char c=s.charAt(right);
            while(map.containsKey(c)){
                char x=s.charAt(left);
                map.put(x,map.get(x)-1);
                if(map.get(x)==0) map.remove(x);
                left++;
            }
            map.put(c,map.getOrDefault(c,0)+1);
            maxLen=Math.max(maxLen,right-left+1);
            
            right++;
        }
        return maxLen;
        
        
    }
}