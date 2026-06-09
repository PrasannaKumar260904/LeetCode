class Solution {
    public int trap(int[] height) {
        //better:leftmax array and rightmax array computing 
        //formula:min(leftmax,rightmax)-arr[i]
        // int n=height.length;
        // int [] leftMax=new int [n];
        // int [] rightMax=new int [n];
        // int trapWater=0;
        // leftMax[0]=height[0];
        // for(int i=1;i<n;i++){
        //     leftMax[i]=Math.max(leftMax[i-1],height[i]);
        // }
        // rightMax[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //     rightMax[i]=Math.max(rightMax[i+1],height[i]);
        // }
        // for(int i=0;i<n;i++){
        //     trapWater+=Math.min(leftMax[i],rightMax[i])-height[i];
        // }
        // return trapWater;


        int n=height.length;
        int left=0,right=n-1;
        int leftmax=0,rightmax=0;
        int trapwater=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }else{
                    trapwater+=leftmax-height[left];
                }
                left++;
            }else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }else{
                    trapwater+=rightmax-height[right];
                }
                right--;
            }
        }
        return trapwater;
        
    }
}