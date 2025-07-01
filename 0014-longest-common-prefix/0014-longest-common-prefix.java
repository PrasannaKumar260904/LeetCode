class Solution {
    public String longestCommonPrefix(String[] strs) {
        String preffix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(preffix)){
                preffix=preffix.substring(0,preffix.length()-1);
            }
            if(preffix.isEmpty())return "";
        }
        return preffix;
        
        
    }
}