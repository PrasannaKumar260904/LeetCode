class Solution {
    public static int findMax(int []arr){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);

        }
        return maxi;
    }
    public static int totalHrs(int [] arr,int hourly){
        int totalHr=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            totalHr+=Math.ceil((double)(arr[i])/(double)(hourly));
        }
        return totalHr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=findMax(piles);
        int low=1,high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            int reqHrs=totalHrs(piles,mid);
            if(reqHrs<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
}