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
        // HashMap<Integer,Integer> freq=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        // }
        // PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->freq.get(a)-freq.get(b));
        // for(int x:freq.keySet()){
        //     pq.offer(x);
        //     if(pq.size()>k){
        //         pq.poll();
        //     }
        // }
        // int [] ans=new int[k];
        // for(int i=0;i<ans.length;i++){
        //     ans[i]=pq.poll();

        // }
        // return ans;


        
    }
}