class Solution {
    public int lengthOfLongestSubstring(String s) {
        // //HashSet solution
        // int left=0;
        // int length=0;
        // int right=0;
        // HashSet<Character> set=new HashSet<>();
        // while (right<s.length()){
        //     char ch=s.charAt(right);
        //     while(set.contains(ch)){
        //         set.remove(s.charAt(left));
                
        //         left++;
                
        //     }
            
        //     set.add(ch);
        //     length=Math.max(length,right-left+1);
        //     right++;

        // }
        // return length;

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