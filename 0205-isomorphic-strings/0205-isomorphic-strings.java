class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        int [] maparr=new int [512];//256 for s and 256 for t
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            //check ascii 
            if(maparr[c1]!=maparr[c2+256]){
                return false;
            }
            //converting into ascii
            maparr[c1]=i+1;
            maparr[c2+256]=i+1;
        }
        return true;
        
    }
}