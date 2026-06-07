class Solution {
    public boolean isAnagram(String s, String t) {
        int []freq=new int[26];
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        for(char ch:ch1){
            freq[ch-'a']++;
            
        }
        for(char ch:ch2){
            freq[ch-'a']--;
        }
        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
        
        //char[] ch1=s.toCharArray();
        // char[] ch2=t.toCharArray();
        // Arrays.sort(ch1);
        // Arrays.sort(ch2);
        // if(s.length()!=t.length())return false;
        // for(char i=0;i<ch1.length;i++){
        //     if(ch1[i]!=ch2[i]){
        //         return false;
        //     }
        // }
        // return true;





        
        
    }
}