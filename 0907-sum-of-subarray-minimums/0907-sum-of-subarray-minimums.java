class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int n=arr.length;
        int mod=(int)1e9+7;
        Stack<Integer> st=new Stack<>();
        int [] pse=new int[n];
        int [] nse=new int [n];
        long sum=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sum=(sum+(arr[i]*left%mod)*right%mod)%mod;
        }
        return (int)sum;
    }
}