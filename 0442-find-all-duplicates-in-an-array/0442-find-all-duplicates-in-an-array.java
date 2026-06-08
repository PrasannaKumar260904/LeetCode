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
        // HashSet<Integer> set=new HashSet<>();
        // for(int x:nums){
        //     if(set.contains(x)){
        //         dup.add(x);

        //     }
        //     set.add(x);
        // }
        // return dup;
        //optimal in place array modification
        //step 1: go to index here zero based index make one based
        //step 2:if that index is already negative means <0 it is duplicate already we make that negative(constraint in question all postives initially and 1 <= n <= 105)
        //step 3: or if we visiting first time we make that negative

        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0){
                dup.add(Math.abs(nums[i]));
            }else{
                nums[idx]=-nums[idx];
            }

        }
        return dup;




        
    }
}