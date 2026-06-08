class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup=new ArrayList<>();
        if(nums.length==1)return new ArrayList<>();
        //brute
        
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             dup.add(nums[i]);
        //         }

        //     }
        // }
        // return dup;
        //better
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            if(set.contains(x)){
                dup.add(x);

            }
            set.add(x);
        }
        return dup;



        
    }
}