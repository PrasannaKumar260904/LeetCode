class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int left=0,right=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                left=i+1;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
        
    }
}