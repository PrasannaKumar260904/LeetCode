class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long maxSum=sumSubArrayMax(nums);
        long minSum=sumSubArrayMin(nums);
        return maxSum-minSum;
        
    }
    public long sumSubArrayMin(int[] arr){
        int n=arr.length;
        long sum=0;
        
        Stack<Integer> st=new Stack<>();
        int []pse=new int[n];
        int []nse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                st.pop();
            
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }

        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sum+=(long)(arr[i]*left*right);

        }
        return sum;
    }
     public long sumSubArrayMax(int[] arr){
        int n=arr.length;
        long sum=0;
        
        Stack<Integer> st=new Stack<>();
        int []pse=new int[n];
        int []nse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
                st.pop();
            
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }

        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sum+=(long)(arr[i]*left*right);
           

        }
        return sum;
    }
}