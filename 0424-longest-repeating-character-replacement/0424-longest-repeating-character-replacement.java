class Solution {
    public int characterReplacement(String s, int k) {
        // int n=s.length();
        // int maxlen=0;
        // for(int i=0;i<n;i++){
        //     int hash[]=new int [26];
        //     int maxfreq=0;
        //     for(int j=i;j<n;j++){
        //         hash[s.charAt(j)-'A']++;
        //         maxfreq=Math.max(maxfreq,hash[s.charAt(j)- 'A']);
        //         int changes=(j-i+1)-maxfreq;
        //         if(changes<=k){
        //             maxlen=Math.max(maxlen,j-i+1);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return maxlen;
        int n=s.length();
        int maxlen=0,left=0,right=0,maxfreq=0;
        int hash[]=new int [26];
        while(right<n){
            int idx=s.charAt(right)-'A';
            hash[idx]++;
            maxfreq=Math.max(maxfreq,hash[idx]);
           
            while((right-left+1)-maxfreq>k){
                hash[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
            
        }
        return maxlen;





    }
}