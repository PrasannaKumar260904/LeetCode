class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int y=m+n;
        int i=0,j=0,k=0;
        int [] temp=new int [y];
        for(int x=0;x<y;x++){
            temp[x]=nums1[x];
        }
        
        while(i<y&&j<m&&k<n){
            if(temp[j]<=nums2[k]){
                nums1[i]=temp[j];
                j++;
            }
            else{
                nums1[i]=nums2[k];
                k++;
            }
            i++;
        }
        while(j<m&&i<y){
            nums1[i]=temp[j];
            j++;
            i++;
        }
        while(k<n&&i<y){
            nums1[i]=nums2[k];
            k++;
            i++;
        }




        
    }
}