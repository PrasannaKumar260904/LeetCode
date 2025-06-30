class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder ();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')i--;
            if(i<0) break;
            int end=i;
            while(i>=0 && s.charAt(i)!=' ')i--;
            int start=i+1;
            res.append(s.substring(start,end+1)).append(" ");
            
        }
        return res.toString().trim();
    }
}