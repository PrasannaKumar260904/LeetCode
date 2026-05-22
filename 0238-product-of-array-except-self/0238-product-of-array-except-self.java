class Solution {
    public int[] productExceptSelf(int[] nums) {
        //better 
        int [] prefix=new int[nums.length];
        int [] postfix=new int [nums.length];
        int [] ans=new int [nums.length];
        //prefix constructing
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
             prefix[i]=prefix[i-1]*nums[i-1];

        }
        //postfix constructing
        postfix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            postfix[i]=postfix[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix[i]*postfix[i];
        }
        return ans;
        //optimal solution without using extra arrays
        // int [] ans=new int [nums.length];
        // int prefix=1;
        // for(int i=0;i<nums.length;i++){
        //     ans[i]=prefix;
        //     prefix*=nums[i];
        // }
        // int postfix=1;
        // for(int i=nums.length-1;i>=0;i--){
        //     ans[i]*=postfix;
        //     postfix*=nums[i];
        // }
        // return ans;

        
    }
}