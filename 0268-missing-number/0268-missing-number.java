class Solution {
    
    public int missingNumber(int[] nums) {
        //int n=nums.length;
        //int sum=(n*(n+1))/2;
        //int s2=0;
       // for(int i=0;i<n;i++){
       //     s2+=nums[i];
       // }
        //return sum-s2;
        //using xor logic
        int n=nums.length;
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n;i++){
            xor1^=i;
            xor2^=nums[i];
        }
        xor1^=n;//last number include
        return xor1^xor2;
        
    }
}