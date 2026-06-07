class Solution {
    public int subarraySum(int[] nums, int k) {
        // int cnt=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
            
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             cnt++;

        //         }

        //     }
        // }
        // return cnt;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            //currentPrefix-oldPrefix=k
            //currentPrefix-k=oldPrefix=(sum-k=oldPrefix)

            if(mp.containsKey(sum-k)){
                cnt+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);


        }
        return cnt;
        
    }
}