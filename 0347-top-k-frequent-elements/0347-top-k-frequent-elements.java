class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        //convert map entries to list
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(freq.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int [] ans=new int[k];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i).getKey();
        }
        return ans;

        
    }
}