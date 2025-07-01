class Solution {
    public int maxDepth(String s) {
        int max=0;
        int depth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                depth++;
                max=Math.max(max,depth);
            }else if(ch==')'){
                depth--;
            }
        }
        return max;
        
    }
}