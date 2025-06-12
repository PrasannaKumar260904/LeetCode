class Solution {
    public void swap(int []nums,int start,int end){
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }


        }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        k=k%n;
        
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
        return;

        
    }
}