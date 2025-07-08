class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0,right=0,maxLen=0;
        int hash []=new int[256];
        Arrays.fill(hash,-1);
        while(right<n){
            char c=s.charAt(right);
            if(hash[c]!=-1 && hash[c]>=left){
                left=hash[c]+1;
            }
            maxLen=Math.max(maxLen,right-left+1);
            hash[c]=right;
            right++;
        }
        return maxLen;
        
        
    }
}