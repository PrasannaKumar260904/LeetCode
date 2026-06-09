class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] freq1=new int[26];
        int [] freq2=new int[26];
        if(s1.length()>s2.length())return false;
        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;

        }
        int k=s1.length();
        for(int i=0;i<k;i++){
            char c=s2.charAt(i);
            freq2[c-'a']++;

        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }
        for(int l=k;l<s2.length();l++){
           
            freq2[s2.charAt(l)-'a']++;
            freq2[s2.charAt(l-k)-'a']--;
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;

        
        
    }
}