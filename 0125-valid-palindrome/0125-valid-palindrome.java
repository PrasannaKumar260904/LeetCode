class Solution {
    public boolean isPalindrome(String s) {
        
        String res=s.replaceAll("[^a-z0-9A-Z]","").toLowerCase();
        char[]ch=res.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right)
        {
            if(ch[left]!=ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}