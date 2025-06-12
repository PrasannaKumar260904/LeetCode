class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        int [] ans=new int [2];
        ans[0]=ans[1]=-1;
        
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=nums[i];
            int moreNeeded=target-a;
            if(mpp.containsKey(moreNeeded)){
                ans[1]=i;
                ans[0]=mpp.get(moreNeeded);
                return ans;
            }
            mpp.put(nums[i],i);
           
        }
        return ans;
      
       
        
    }
}